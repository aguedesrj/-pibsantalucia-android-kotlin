package br.com.pibsantalucia.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0013\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u00a2\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lbr/com/pibsantalucia/api/ApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "code", "", "(ILjava/lang/String;)V", "getCode", "app_release"})
public final class ApiException extends java.lang.RuntimeException {
    private int code;
    
    public final int getCode() {
        return 0;
    }
    
    public ApiException(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
        super();
    }
    
    public ApiException(@org.jetbrains.annotations.NotNull
    java.lang.Exception ex) {
        super();
    }
    
    public ApiException(int code, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
        super();
    }
}