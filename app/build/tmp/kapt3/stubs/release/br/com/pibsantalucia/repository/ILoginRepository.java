package br.com.pibsantalucia.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\f"}, d2 = {"Lbr/com/pibsantalucia/repository/ILoginRepository;", "", "changePassword", "Lretrofit2/Call;", "Lbr/com/pibsantalucia/model/ResponsePayload;", "Lbr/com/pibsantalucia/model/User;", "payload", "Lcom/google/gson/JsonObject;", "forgotPassword", "", "login", "register", "app_release"})
@br.com.pibsantalucia.api.URLBase(value = "http://ec2-52-15-178-77.us-east-2.compute.amazonaws.com/Api/")
public abstract interface ILoginRepository {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "LoginRest/Login")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<br.com.pibsantalucia.model.User>> login(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.google.gson.JsonObject payload);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "LoginRest/EsquiciSenha")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.lang.String>> forgotPassword(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.google.gson.JsonObject payload);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "LoginRest/Cadastro")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<br.com.pibsantalucia.model.User>> register(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.google.gson.JsonObject payload);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "LoginRest/TrocaSenha")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<br.com.pibsantalucia.model.User>> changePassword(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.google.gson.JsonObject payload);
}