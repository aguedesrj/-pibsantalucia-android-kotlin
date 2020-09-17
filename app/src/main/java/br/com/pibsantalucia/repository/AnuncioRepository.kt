package br.com.pibsantalucia.repository

import android.app.Application
import android.util.Log
import br.com.pibsantalucia.PibSantaLuciaApplication
import br.com.pibsantalucia.api.ApiException
import br.com.pibsantalucia.api.ApiManager
import br.com.pibsantalucia.api.Constants
import br.com.pibsantalucia.model.*
import com.google.gson.Gson
import com.google.gson.JsonObject
import io.reactivex.Observable
import retrofit2.Response

class AnuncioRepository {

    fun list(): Observable<ArrayList<Anuncio>> {
        return Observable.create{ emitter ->

            try {
                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IAnuncioRepository::class.java)
                var response: Response<ResponsePayload<ArrayList<Anuncio>>> = service.lista(user.token, "application/json").execute()
                if (response.errorBody() == null) {
                    var list: ArrayList<Anuncio>? = response.body()?.data

                    emitter.onNext(list!!)
                    emitter.onComplete()
                } else {
                    val errorResponse = response.errorBody()
                    val returnError = errorResponse!!.string()

                    val errorJson = Gson().fromJson<ResponsePayload<ArrayList<ListPeople>>>(returnError, ResponsePayload::class.java)

                    if (errorJson?.message != null) {
                        throw ApiException(errorJson?.message!!)
                    } else {
                        throw Exception()
                    }
                }
            } catch (e: Exception) {
                if (e is ApiException) {
                    emitter.onError(e)
                } else {
                    emitter.onError(ApiException(Constants.MSG_SYSTEM_NOT_AVAILABLE))
                }
            }
        }
    }

    fun save(anuncio: Anuncio): Observable<String> {
        return Observable.create{ emitter ->
            try {

                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IAnuncioRepository::class.java)
                var response: Response<ResponsePayload<String>> = service.salvar(user.token, "application/json", anuncio).execute()
                if (response.errorBody() == null) {
                    emitter.onNext(response.body()?.message!!)
                    emitter.onComplete()
                } else {
                    val errorResponse = response.errorBody()
                    val returnError = errorResponse!!.string()

                    val errorJson = Gson().fromJson<ResponsePayload<User>>(returnError, ResponsePayload::class.java)

                    if (errorJson?.message != null) {
                        throw ApiException(errorJson?.message!!)
                    } else {
                        throw Exception()
                    }
                }
            } catch (e: Exception) {
                if (e is ApiException) {
                    emitter.onError(e)
                } else {
                    emitter.onError(ApiException(Constants.MSG_SYSTEM_NOT_AVAILABLE))
                }
            }
        }
    }
}