package br.com.pibsantalucia.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.net.ConnectException
import java.net.UnknownHostException
import java.util.concurrent.TimeUnit

object ApiManager {

    fun <T> createRetrofit(clazz: Class<T>): T {

        val interceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        val okHttpClient = OkHttpClient.Builder().apply {
            connectTimeout(Constants.TIME_OUT, TimeUnit.SECONDS)
            readTimeout(Constants.TIME_OUT, TimeUnit.SECONDS)
            addInterceptor(interceptor)
            addInterceptor{ chain ->
                var request = chain.request()
                try {
                    chain.proceed(request)
                } catch (e: ConnectException) {
                    throw ApiException(Constants.MSG_CONNECTION_NOT_AVAILABLE)
                }catch (e: UnknownHostException){
                    throw ApiException(Constants.MSG_CONNECTION_NOT_AVAILABLE)
                } catch (e: Exception) {
                    throw ApiException(Constants.MSG_SYSTEM_NOT_AVAILABLE)
                }
            }
        }

        val annotations = clazz.annotations

        var url = ""

        for (a in annotations) {
            if (a is URLBase) {
                url = a.value
                break
            }
        }

        val gson = GsonBuilder()
            .create()

        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient.build())
            .build()

        return retrofit.create(clazz)
    }
}