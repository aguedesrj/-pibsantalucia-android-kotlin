package br.com.pibsantalucia.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\'J2\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lbr/com/pibsantalucia/repository/IAnuncioRepository;", "", "lista", "Lretrofit2/Call;", "Lbr/com/pibsantalucia/model/ResponsePayload;", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/Anuncio;", "Lkotlin/collections/ArrayList;", "token", "", "contentType", "salvar", "anuncio", "app_release"})
@br.com.pibsantalucia.api.URLBase(value = "http://ec2-52-15-178-77.us-east-2.compute.amazonaws.com/Api/")
public abstract interface IAnuncioRepository {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "AnuncioRest/Lista")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.util.ArrayList<br.com.pibsantalucia.model.Anuncio>>> lista(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "AnuncioRest/Salva")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.lang.String>> salvar(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    br.com.pibsantalucia.model.Anuncio anuncio);
}