package br.com.pibsantalucia.repository

import br.com.pibsantalucia.BuildConfig
import br.com.pibsantalucia.api.URLBase
import br.com.pibsantalucia.model.*
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*

@URLBase(BuildConfig.API_BASE_URL)
interface IEscalaRepository {

    @GET("EscalaRest/Lista")
    fun lista(@Header("Authentication") token: String,
              @Header("Content-Type") contentType: String,
              @Query("escFlgTipo") escFlgTipo: Int): Call<ResponsePayload<ArrayList<EscalaMeses>>>

    @POST("EscalaRest/Salva")
    fun salvar(@Header("Authentication") token: String,
               @Header("Content-Type") contentType: String,
               @Body escalas: List<EscalaMeses>): Call<ResponsePayload<String>>
}