package br.com.pibsantalucia.repository

import android.app.Application
import android.util.Log
import br.com.pibsantalucia.PibSantaLuciaApplication
import br.com.pibsantalucia.api.ApiException
import br.com.pibsantalucia.api.ApiManager
import br.com.pibsantalucia.api.Constants
import br.com.pibsantalucia.model.Pastoral
import br.com.pibsantalucia.model.ResponsePayload
import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.model.ViaCep
import com.google.gson.Gson
import com.google.gson.JsonObject
import io.reactivex.Observable
import retrofit2.Response

class LoginRepository {

    fun login(cpfOrEmail: String, password: String): Observable<User> {
        return Observable.create{ emitter ->
            try {

                var loginPayload = JsonObject()
                loginPayload.addProperty("cpfOrEmail", cpfOrEmail)
                loginPayload.addProperty("password", password)

                val service = ApiManager.createRetrofit(ILoginRepository::class.java)
                var response: Response<ResponsePayload<User>> = service.login(loginPayload).execute()
                if (response.errorBody() == null) {
                    var user: User? = response.body()?.data

                    Log.e("", "Sucesso no login")
                    emitter.onNext(response.body()?.data!!)
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

    fun forgotPassword(cpfOrEmail: String): Observable<String> {
        return Observable.create{emitter ->
            try {

                var loginPayload = JsonObject()
                loginPayload.addProperty("cpfOrEmail", cpfOrEmail)

                val service = ApiManager.createRetrofit(ILoginRepository::class.java)
                var response: Response<ResponsePayload<String>> = service.forgotPassword(loginPayload).execute()
                if (response.errorBody() == null) {
                    Log.e("", "Sucesso no esqueci minha senha.")
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

    fun register(cpfOrEmail: String): Observable<String> {
        return Observable.create{emitter ->
            try {

                var loginPayload = JsonObject()
                loginPayload.addProperty("cpfOrEmail", cpfOrEmail)

                val service = ApiManager.createRetrofit(ILoginRepository::class.java)
                var response: Response<ResponsePayload<User>> = service.register(loginPayload).execute()
                if (response.errorBody() == null) {
                    Log.e("", "Cadastro feito com sucesso")
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

    fun changePassword(cpfOrEmail: String, passwordNew: String, passwordNewConfirmation: String): Observable<ResponsePayload<User>> {
        return Observable.create{emitter ->
            try {

                var loginPayload = JsonObject()
                loginPayload.addProperty("cpfOrEmail", cpfOrEmail)
                loginPayload.addProperty("passwordNew", passwordNew)
                loginPayload.addProperty("passwordNewConfirmation", passwordNewConfirmation)

                val service = ApiManager.createRetrofit(ILoginRepository::class.java)
                var response: Response<ResponsePayload<User>> = service.changePassword(loginPayload).execute()
                if (response.errorBody() == null) {
                    Log.e("", "Senha alterada com sucesso.")
                    emitter.onNext(response.body()!!)
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