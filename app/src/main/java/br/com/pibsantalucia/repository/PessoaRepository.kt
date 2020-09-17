package br.com.pibsantalucia.repository

import android.provider.Contacts
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

class PessoaRepository {

    fun listPeoples(): Observable<ArrayList<ListPeople>> {
        return Observable.create{ emitter ->

            try {
                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<ArrayList<ListPeople>>> = service.listPeoples(user.token, "application/json").execute()
                if (response.errorBody() == null) {
                    var list: ArrayList<ListPeople>? = response.body()?.data

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

    fun listAniversariantes(): Observable<ArrayList<ListPeople>> {
        return Observable.create{ emitter ->

            try {
                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<ArrayList<ListPeople>>> = service.listAniversariantes(user.token, "application/json").execute()
                if (response.errorBody() == null) {
                    var list: ArrayList<ListPeople>? = response.body()?.data

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

    fun prepareRegistration(): Observable<PrepareRegistration> {
        return Observable.create{ emitter ->

            try {
                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<PrepareRegistration>> = service.prepareRegistration(user.token, "application/json").execute()
                if (response.errorBody() == null) {
                    var prepareRegistration: PrepareRegistration? = response.body()?.data

                    emitter.onNext(prepareRegistration!!)
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

    fun searchForCep(cep: String): Observable<ViaCep> {
        return Observable.create{ emitter ->

            try {
                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<ViaCep>> = service.searchForCep(user.token, "application/json", cep).execute()
                if (response.errorBody() == null) {
                    var viaCep: ViaCep? = response.body()?.data

                    emitter.onNext(viaCep!!)
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

    fun getPerson(pesCodigo: Long): Observable<Person> {
        return Observable.create{ emitter ->
            try {

                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<Person>> = service.getPerson(user.token, "application/json", pesCodigo).execute()
                if (response.errorBody() == null) {
                    var person: Person? = response.body()?.data

                    Log.e("", "Sucesso ao obter Pessoas.")
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

    fun save(person: Person): Observable<String> {
        return Observable.create{ emitter ->
            try {

                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<String>> = service.save(user.token, "application/json", person).execute()
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

    fun saveObito(obito: Obito): Observable<String> {
        return Observable.create{ emitter ->
            try {

                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<String>> = service.saveObito(user.token, "application/json", obito).execute()
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

    fun saveTransferencia(transferencia: Transferencia): Observable<String> {
        return Observable.create{ emitter ->
            try {

                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<String>> = service.saveTransferencia(user.token, "application/json", transferencia).execute()
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

    fun saveReconciliacao(reconciliacao: Reconciliacao): Observable<String> {
        return Observable.create{ emitter ->
            try {

                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<String>> = service.saveReconciliacao(user.token, "application/json", reconciliacao).execute()
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

    fun saveDesligamento(desligamento: Desligamento): Observable<String> {
        return Observable.create{ emitter ->
            try {

                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<String>> = service.saveDesligamento(user.token, "application/json", desligamento).execute()
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

    fun pastoral(): Observable<Pastoral> {
        return Observable.create{emitter ->
            try {

                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<Pastoral>> = service.getPastoral(user.token, "application/json").execute()
                if (response.errorBody() == null) {
                    Log.e("", "Pastoral obtida com sucesso.")

                    var pastoral: Pastoral? = response.body()?.data

                    emitter.onNext(pastoral!!)
                    emitter.onComplete()
                } else {
                    val errorResponse = response.errorBody()
                    val returnError = errorResponse!!.string()

                    val errorJson = Gson().fromJson<ResponsePayload<Pastoral>>(returnError, ResponsePayload::class.java)

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

    fun saveDeviceMobile(deviceMobile: DeviceMobile): Observable<String> {
        return Observable.create{ emitter ->
            try {

                var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

                val service = ApiManager.createRetrofit(IPessoaRepository::class.java)
                var response: Response<ResponsePayload<String>> = service.saveDeviceMobile(user.token, "application/json", deviceMobile).execute()
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