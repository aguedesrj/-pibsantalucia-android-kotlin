package br.com.pibsantalucia.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006\'"}, d2 = {"Lbr/com/pibsantalucia/model/Contact;", "Ljava/io/Serializable;", "()V", "ctoCodigo", "", "getCtoCodigo", "()J", "setCtoCodigo", "(J)V", "ctoDdd", "", "getCtoDdd", "()Ljava/lang/String;", "setCtoDdd", "(Ljava/lang/String;)V", "ctoDescricaoEmail", "getCtoDescricaoEmail", "setCtoDescricaoEmail", "ctoNumeroTelefone", "getCtoNumeroTelefone", "setCtoNumeroTelefone", "localOnly", "", "getLocalOnly", "()Z", "setLocalOnly", "(Z)V", "newContact", "getNewContact", "setNewContact", "removeContact", "getRemoveContact", "setRemoveContact", "typeContact", "Lbr/com/pibsantalucia/model/TypeContact;", "getTypeContact", "()Lbr/com/pibsantalucia/model/TypeContact;", "setTypeContact", "(Lbr/com/pibsantalucia/model/TypeContact;)V", "app_release"})
public final class Contact implements java.io.Serializable {
    private long ctoCodigo;
    @org.jetbrains.annotations.Nullable
    private java.lang.String ctoDescricaoEmail;
    @org.jetbrains.annotations.Nullable
    private java.lang.String ctoDdd;
    @org.jetbrains.annotations.Nullable
    private java.lang.String ctoNumeroTelefone;
    @com.google.gson.annotations.SerializedName(value = "novoContato")
    private boolean newContact;
    @com.google.gson.annotations.SerializedName(value = "excluidoContato")
    private boolean removeContact;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "tipoContatoVO")
    private br.com.pibsantalucia.model.TypeContact typeContact;
    private boolean localOnly;
    
    public final long getCtoCodigo() {
        return 0L;
    }
    
    public final void setCtoCodigo(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCtoDescricaoEmail() {
        return null;
    }
    
    public final void setCtoDescricaoEmail(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCtoDdd() {
        return null;
    }
    
    public final void setCtoDdd(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCtoNumeroTelefone() {
        return null;
    }
    
    public final void setCtoNumeroTelefone(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final boolean getNewContact() {
        return false;
    }
    
    public final void setNewContact(boolean p0) {
    }
    
    public final boolean getRemoveContact() {
        return false;
    }
    
    public final void setRemoveContact(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.pibsantalucia.model.TypeContact getTypeContact() {
        return null;
    }
    
    public final void setTypeContact(@org.jetbrains.annotations.Nullable
    br.com.pibsantalucia.model.TypeContact p0) {
    }
    
    public final boolean getLocalOnly() {
        return false;
    }
    
    public final void setLocalOnly(boolean p0) {
    }
    
    public Contact() {
        super();
    }
}