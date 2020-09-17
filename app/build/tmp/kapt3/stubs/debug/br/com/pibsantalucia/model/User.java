package br.com.pibsantalucia.model;

import java.lang.System;

@androidx.room.Entity(tableName = "User")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b\u00a8\u0006\'"}, d2 = {"Lbr/com/pibsantalucia/model/User;", "", "()V", "cpfOrEmail", "", "getCpfOrEmail", "()Ljava/lang/String;", "setCpfOrEmail", "(Ljava/lang/String;)V", "perCodigo", "", "getPerCodigo", "()I", "setPerCodigo", "(I)V", "pesCodigo", "", "getPesCodigo", "()J", "setPesCodigo", "(J)V", "pesNome", "getPesNome", "setPesNome", "token", "getToken", "setToken", "umeSenha", "getUmeSenha", "setUmeSenha", "umeSenhaTemp", "", "getUmeSenhaTemp", "()Z", "setUmeSenhaTemp", "(Z)V", "urlPhoto", "getUrlPhoto", "setUrlPhoto", "app_debug"})
public final class User {
    @androidx.room.ColumnInfo(name = "pesCodigo")
    @androidx.room.PrimaryKey
    private long pesCodigo;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "cpfOrEmail")
    private java.lang.String cpfOrEmail;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "umeSenha")
    private java.lang.String umeSenha;
    @androidx.room.ColumnInfo(name = "umeSenhaTemp")
    private boolean umeSenhaTemp;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "pesNome")
    private java.lang.String pesNome;
    @androidx.room.ColumnInfo(name = "perCodigo")
    private int perCodigo;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "urlPhoto")
    private java.lang.String urlPhoto;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "token")
    private java.lang.String token;
    
    public final long getPesCodigo() {
        return 0L;
    }
    
    public final void setPesCodigo(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCpfOrEmail() {
        return null;
    }
    
    public final void setCpfOrEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUmeSenha() {
        return null;
    }
    
    public final void setUmeSenha(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getUmeSenhaTemp() {
        return false;
    }
    
    public final void setUmeSenhaTemp(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPesNome() {
        return null;
    }
    
    public final void setPesNome(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getPerCodigo() {
        return 0;
    }
    
    public final void setPerCodigo(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrlPhoto() {
        return null;
    }
    
    public final void setUrlPhoto(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public User() {
        super();
    }
}