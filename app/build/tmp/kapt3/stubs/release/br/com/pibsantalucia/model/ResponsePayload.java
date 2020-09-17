package br.com.pibsantalucia.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00018\u00008\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lbr/com/pibsantalucia/model/ResponsePayload;", "T", "", "()V", "code", "", "getCode$app_release", "()I", "setCode$app_release", "(I)V", "data", "getData$app_release", "()Ljava/lang/Object;", "setData$app_release", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "message", "", "getMessage$app_release", "()Ljava/lang/String;", "setMessage$app_release", "(Ljava/lang/String;)V", "app_release"})
public final class ResponsePayload<T extends java.lang.Object> {
    @com.google.gson.annotations.SerializedName(value = "code")
    private int code;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "object")
    private T data;
    
    public final int getCode$app_release() {
        return 0;
    }
    
    public final void setCode$app_release(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage$app_release() {
        return null;
    }
    
    public final void setMessage$app_release(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData$app_release() {
        return null;
    }
    
    public final void setData$app_release(@org.jetbrains.annotations.Nullable
    T p0) {
    }
    
    public ResponsePayload() {
        super();
    }
}