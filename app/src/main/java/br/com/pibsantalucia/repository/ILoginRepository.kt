package br.com.pibsantalucia.repository

import br.com.pibsantalucia.BuildConfig
import br.com.pibsantalucia.api.URLBase
import br.com.pibsantalucia.model.Desligamento
import br.com.pibsantalucia.model.Pastoral
import br.com.pibsantalucia.model.ResponsePayload
import br.com.pibsantalucia.model.User
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

@URLBase(BuildConfig.API_BASE_URL)
interface ILoginRepository {

    @POST("LoginRest/Login")
    fun login(@Body payload: JsonObject): Call<ResponsePayload<User>>

    @POST("LoginRest/EsquiciSenha")
    fun forgotPassword(@Body payload: JsonObject): Call<ResponsePayload<String>>

    @POST("LoginRest/Cadastro")
    fun register(@Body payload: JsonObject): Call<ResponsePayload<User>>

    @POST("LoginRest/TrocaSenha")
    fun changePassword(@Body payload: JsonObject): Call<ResponsePayload<User>>
}