package br.com.pibsantalucia.repository

import br.com.pibsantalucia.BuildConfig
import br.com.pibsantalucia.api.URLBase
import br.com.pibsantalucia.model.*
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*

@URLBase(BuildConfig.API_BASE_URL)
interface IPessoaRepository {

    @GET("PessoaRest/GetAniversariantes")
    fun listAniversariantes(@Header("Authentication") token: String,
                            @Header("Content-Type") contentType: String): Call<ResponsePayload<ArrayList<ListPeople>>>

    @GET("PessoaRest/GetLista")
    fun listPeoples(@Header("Authentication") token: String,
                    @Header("Content-Type") contentType: String): Call<ResponsePayload<ArrayList<ListPeople>>>

    @GET("PessoaRest/GetPreparaCadastro")
    fun prepareRegistration(@Header("Authentication") token: String,
                            @Header("Content-Type") contentType: String): Call<ResponsePayload<PrepareRegistration>>

    @GET("PessoaRest/GetCep")
    fun searchForCep(@Header("Authentication") token: String,
                     @Header("Content-Type") contentType: String,
                     @Query("cep") cep: String): Call<ResponsePayload<ViaCep>>

    @GET("PessoaRest/GetMembro")
    fun getPerson(@Header("Authentication") token: String,
                  @Header("Content-Type") contentType: String,
                  @Query("pesCodigo") pesCodigo: Long): Call<ResponsePayload<Person>>

    @POST("PessoaRest/SavePerson")
    fun save(@Header("Authentication") token: String,
             @Header("Content-Type") contentType: String,
             @Body person: Person): Call<ResponsePayload<String>>

    @POST("PessoaRest/SaveObito")
    fun saveObito(@Header("Authentication") token: String,
                  @Header("Content-Type") contentType: String,
                  @Body obito: Obito): Call<ResponsePayload<String>>

    @POST("PessoaRest/SaveTransferencia")
    fun saveTransferencia(@Header("Authentication") token: String,
                          @Header("Content-Type") contentType: String,
                          @Body transferencia: Transferencia): Call<ResponsePayload<String>>

    @POST("PessoaRest/SaveReconciliacao")
    fun saveReconciliacao(@Header("Authentication") token: String,
                          @Header("Content-Type") contentType: String,
                          @Body reconciliacao: Reconciliacao): Call<ResponsePayload<String>>

    @POST("PessoaRest/SaveDesligamento")
    fun saveDesligamento(@Header("Authentication") token: String,
                          @Header("Content-Type") contentType: String,
                          @Body desligamento: Desligamento): Call<ResponsePayload<String>>

    @GET("PessoaRest/GetPastoral")
    fun getPastoral(@Header("Authentication") token: String,
                    @Header("Content-Type") contentType: String): Call<ResponsePayload<Pastoral>>

    @POST("PessoaRest/SaveDeviceMobile")
    fun saveDeviceMobile(@Header("Authentication") token: String,
                         @Header("Content-Type") contentType: String,
                         @Body deviceMobile: DeviceMobile): Call<ResponsePayload<String>>
}