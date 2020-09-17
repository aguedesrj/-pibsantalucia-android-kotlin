package br.com.pibsantalucia.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b;\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR2\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001c\u0010#\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001c\u0010&\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\f\"\u0004\b(\u0010\u000eR\u001c\u0010)\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR\u001c\u0010,\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u001c\u0010/\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR\u001c\u00102\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR\u001c\u00105\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR\u001c\u00108\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000eR\u001c\u0010;\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR\u001c\u0010>\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u000eR\u001c\u0010A\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR\u001c\u0010D\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000eR\u001c\u0010G\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\f\"\u0004\bI\u0010\u000eR\u001c\u0010J\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\u001c\u0010M\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR\u001c\u0010P\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000eR\u001c\u0010S\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\f\"\u0004\bU\u0010\u000e\u00a8\u0006V"}, d2 = {"Lbr/com/pibsantalucia/model/Person;", "Ljava/io/Serializable;", "()V", "address", "Lbr/com/pibsantalucia/model/Address;", "getAddress", "()Lbr/com/pibsantalucia/model/Address;", "setAddress", "(Lbr/com/pibsantalucia/model/Address;)V", "dtAniversarioFmt", "", "getDtAniversarioFmt", "()Ljava/lang/String;", "setDtAniversarioFmt", "(Ljava/lang/String;)V", "enderecoCompleto", "getEnderecoCompleto", "setEnderecoCompleto", "listContact", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/Contact;", "Lkotlin/collections/ArrayList;", "getListContact", "()Ljava/util/ArrayList;", "setListContact", "(Ljava/util/ArrayList;)V", "pesCodigo", "", "getPesCodigo", "()J", "setPesCodigo", "(J)V", "pesCpf", "getPesCpf", "setPesCpf", "pesDtBatismo", "getPesDtBatismo", "setPesDtBatismo", "pesDtCadastro", "getPesDtCadastro", "setPesDtCadastro", "pesDtCasamento", "getPesDtCasamento", "setPesDtCasamento", "pesDtNascimento", "getPesDtNascimento", "setPesDtNascimento", "pesFglMembro", "getPesFglMembro", "setPesFglMembro", "pesFoto", "getPesFoto", "setPesFoto", "pesFotoPath", "getPesFotoPath", "setPesFotoPath", "pesNacionalidade", "getPesNacionalidade", "setPesNacionalidade", "pesNaturalidade", "getPesNaturalidade", "setPesNaturalidade", "pesNome", "getPesNome", "setPesNome", "pesNomeMae", "getPesNomeMae", "setPesNomeMae", "pesNomePai", "getPesNomePai", "setPesNomePai", "pesObservacao", "getPesObservacao", "setPesObservacao", "pesProfissao", "getPesProfissao", "setPesProfissao", "pesSexo", "getPesSexo", "setPesSexo", "pesTipoSanguineo", "getPesTipoSanguineo", "setPesTipoSanguineo", "telefoneCompleto", "getTelefoneCompleto", "setTelefoneCompleto", "app_debug"})
public final class Person implements java.io.Serializable {
    private long pesCodigo;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesNome;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesDtNascimento;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesSexo;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesCpf;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesTipoSanguineo;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesNaturalidade;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesNacionalidade;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesNomeMae;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesNomePai;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesDtCasamento;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesFoto;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesObservacao;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesDtBatismo;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesDtCadastro;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesFglMembro;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesProfissao;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pesFotoPath;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "enderecoVO")
    private br.com.pibsantalucia.model.Address address;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "listaContatoVO")
    private java.util.ArrayList<br.com.pibsantalucia.model.Contact> listContact;
    @org.jetbrains.annotations.Nullable
    private java.lang.String enderecoCompleto;
    @org.jetbrains.annotations.Nullable
    private java.lang.String telefoneCompleto;
    @org.jetbrains.annotations.Nullable
    private java.lang.String dtAniversarioFmt;
    
    public final long getPesCodigo() {
        return 0L;
    }
    
    public final void setPesCodigo(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesNome() {
        return null;
    }
    
    public final void setPesNome(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesDtNascimento() {
        return null;
    }
    
    public final void setPesDtNascimento(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesSexo() {
        return null;
    }
    
    public final void setPesSexo(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesCpf() {
        return null;
    }
    
    public final void setPesCpf(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesTipoSanguineo() {
        return null;
    }
    
    public final void setPesTipoSanguineo(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesNaturalidade() {
        return null;
    }
    
    public final void setPesNaturalidade(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesNacionalidade() {
        return null;
    }
    
    public final void setPesNacionalidade(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesNomeMae() {
        return null;
    }
    
    public final void setPesNomeMae(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesNomePai() {
        return null;
    }
    
    public final void setPesNomePai(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesDtCasamento() {
        return null;
    }
    
    public final void setPesDtCasamento(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesFoto() {
        return null;
    }
    
    public final void setPesFoto(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesObservacao() {
        return null;
    }
    
    public final void setPesObservacao(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesDtBatismo() {
        return null;
    }
    
    public final void setPesDtBatismo(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesDtCadastro() {
        return null;
    }
    
    public final void setPesDtCadastro(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesFglMembro() {
        return null;
    }
    
    public final void setPesFglMembro(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesProfissao() {
        return null;
    }
    
    public final void setPesProfissao(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPesFotoPath() {
        return null;
    }
    
    public final void setPesFotoPath(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.pibsantalucia.model.Address getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable
    br.com.pibsantalucia.model.Address p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<br.com.pibsantalucia.model.Contact> getListContact() {
        return null;
    }
    
    public final void setListContact(@org.jetbrains.annotations.Nullable
    java.util.ArrayList<br.com.pibsantalucia.model.Contact> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEnderecoCompleto() {
        return null;
    }
    
    public final void setEnderecoCompleto(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTelefoneCompleto() {
        return null;
    }
    
    public final void setTelefoneCompleto(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDtAniversarioFmt() {
        return null;
    }
    
    public final void setDtAniversarioFmt(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public Person() {
        super();
    }
}