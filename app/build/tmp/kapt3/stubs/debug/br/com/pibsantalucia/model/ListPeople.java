package br.com.pibsantalucia.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lbr/com/pibsantalucia/model/ListPeople;", "Ljava/io/Serializable;", "()V", "dtAniversarioFmt", "", "getDtAniversarioFmt", "()Ljava/lang/String;", "setDtAniversarioFmt", "(Ljava/lang/String;)V", "pesCodigo", "", "getPesCodigo", "()J", "setPesCodigo", "(J)V", "pesDesligamento", "", "getPesDesligamento", "()Z", "setPesDesligamento", "(Z)V", "pesFglMembro", "getPesFglMembro", "setPesFglMembro", "pesFotoPath", "getPesFotoPath", "setPesFotoPath", "pesNome", "getPesNome", "setPesNome", "pesObito", "getPesObito", "setPesObito", "pesSexo", "getPesSexo", "setPesSexo", "pesTransferencia", "getPesTransferencia", "setPesTransferencia", "app_debug"})
public final class ListPeople implements java.io.Serializable {
    private long pesCodigo;
    @org.jetbrains.annotations.NotNull
    private java.lang.String pesNome;
    @org.jetbrains.annotations.NotNull
    private java.lang.String pesFotoPath;
    @org.jetbrains.annotations.NotNull
    private java.lang.String pesSexo;
    @org.jetbrains.annotations.NotNull
    private java.lang.String dtAniversarioFmt;
    private boolean pesFglMembro;
    private boolean pesObito;
    private boolean pesDesligamento;
    private boolean pesTransferencia;
    
    public final long getPesCodigo() {
        return 0L;
    }
    
    public final void setPesCodigo(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPesNome() {
        return null;
    }
    
    public final void setPesNome(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPesFotoPath() {
        return null;
    }
    
    public final void setPesFotoPath(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPesSexo() {
        return null;
    }
    
    public final void setPesSexo(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDtAniversarioFmt() {
        return null;
    }
    
    public final void setDtAniversarioFmt(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getPesFglMembro() {
        return false;
    }
    
    public final void setPesFglMembro(boolean p0) {
    }
    
    public final boolean getPesObito() {
        return false;
    }
    
    public final void setPesObito(boolean p0) {
    }
    
    public final boolean getPesDesligamento() {
        return false;
    }
    
    public final void setPesDesligamento(boolean p0) {
    }
    
    public final boolean getPesTransferencia() {
        return false;
    }
    
    public final void setPesTransferencia(boolean p0) {
    }
    
    public ListPeople() {
        super();
    }
}