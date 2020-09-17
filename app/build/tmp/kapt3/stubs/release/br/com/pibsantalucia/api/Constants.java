package br.com.pibsantalucia.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lbr/com/pibsantalucia/api/Constants;", "", "()V", "MSG_CONNECTION_NOT_AVAILABLE", "", "getMSG_CONNECTION_NOT_AVAILABLE", "()Ljava/lang/String;", "MSG_SYSTEM_NOT_AVAILABLE", "getMSG_SYSTEM_NOT_AVAILABLE", "TIME_OUT", "", "getTIME_OUT", "()J", "app_release"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MSG_SYSTEM_NOT_AVAILABLE = "Sistema indispon\u00edvel no momento, tente mais tarde!";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MSG_CONNECTION_NOT_AVAILABLE = "Problema com a conex\u00e3o. Tente novamente.";
    private static final long TIME_OUT = 30L;
    public static final br.com.pibsantalucia.api.Constants INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMSG_SYSTEM_NOT_AVAILABLE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMSG_CONNECTION_NOT_AVAILABLE() {
        return null;
    }
    
    public final long getTIME_OUT() {
        return 0L;
    }
    
    private Constants() {
        super();
    }
}