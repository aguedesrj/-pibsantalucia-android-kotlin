package br.com.pibsantalucia.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lbr/com/pibsantalucia/repository/LoginRepository;", "", "()V", "changePassword", "Lio/reactivex/Observable;", "Lbr/com/pibsantalucia/model/ResponsePayload;", "Lbr/com/pibsantalucia/model/User;", "cpfOrEmail", "", "passwordNew", "passwordNewConfirmation", "forgotPassword", "login", "password", "register", "app_debug"})
public final class LoginRepository {
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<br.com.pibsantalucia.model.User> login(@org.jetbrains.annotations.NotNull
    java.lang.String cpfOrEmail, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.String> forgotPassword(@org.jetbrains.annotations.NotNull
    java.lang.String cpfOrEmail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.String> register(@org.jetbrains.annotations.NotNull
    java.lang.String cpfOrEmail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<br.com.pibsantalucia.model.ResponsePayload<br.com.pibsantalucia.model.User>> changePassword(@org.jetbrains.annotations.NotNull
    java.lang.String cpfOrEmail, @org.jetbrains.annotations.NotNull
    java.lang.String passwordNew, @org.jetbrains.annotations.NotNull
    java.lang.String passwordNewConfirmation) {
        return null;
    }
    
    public LoginRepository() {
        super();
    }
}