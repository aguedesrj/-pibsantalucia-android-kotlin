package br.com.pibsantalucia.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lbr/com/pibsantalucia/model/Error;", "", "()V", "code", "", "getCode$app_release", "()I", "setCode$app_release", "(I)V", "message", "", "getMessage$app_release", "()Ljava/lang/String;", "setMessage$app_release", "(Ljava/lang/String;)V", "app_release"})
public class Error {
    @com.google.gson.annotations.SerializedName(value = "code")
    private int code;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message;
    
    public final int getCode$app_release() {
        return 0;
    }
    
    public final void setCode$app_release(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage$app_release() {
        return null;
    }
    
    public final void setMessage$app_release(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public Error() {
        super();
    }
}