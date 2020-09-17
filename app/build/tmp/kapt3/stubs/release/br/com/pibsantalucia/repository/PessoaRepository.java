package br.com.pibsantalucia.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\u0004J\u001c\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\u0004J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0013\u001a\u00020\u0005J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010!\u001a\u00020\"J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010%\u001a\u00020\u0012\u00a8\u0006&"}, d2 = {"Lbr/com/pibsantalucia/repository/PessoaRepository;", "", "()V", "getPerson", "Lio/reactivex/Observable;", "Lbr/com/pibsantalucia/model/Person;", "pesCodigo", "", "listAniversariantes", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/ListPeople;", "Lkotlin/collections/ArrayList;", "listPeoples", "pastoral", "Lbr/com/pibsantalucia/model/Pastoral;", "prepareRegistration", "Lbr/com/pibsantalucia/model/PrepareRegistration;", "save", "", "person", "saveDesligamento", "desligamento", "Lbr/com/pibsantalucia/model/Desligamento;", "saveDeviceMobile", "deviceMobile", "Lbr/com/pibsantalucia/model/DeviceMobile;", "saveObito", "obito", "Lbr/com/pibsantalucia/model/Obito;", "saveReconciliacao", "reconciliacao", "Lbr/com/pibsantalucia/model/Reconciliacao;", "saveTransferencia", "transferencia", "Lbr/com/pibsantalucia/model/Transferencia;", "searchForCep", "Lbr/com/pibsantalucia/model/ViaCep;", "cep", "app_release"})
public final class PessoaRepository {
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.util.ArrayList<br.com.pibsantalucia.model.ListPeople>> listPeoples() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.util.ArrayList<br.com.pibsantalucia.model.ListPeople>> listAniversariantes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<br.com.pibsantalucia.model.PrepareRegistration> prepareRegistration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<br.com.pibsantalucia.model.ViaCep> searchForCep(@org.jetbrains.annotations.NotNull
    java.lang.String cep) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<br.com.pibsantalucia.model.Person> getPerson(long pesCodigo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.String> save(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Person person) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.String> saveObito(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Obito obito) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.String> saveTransferencia(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Transferencia transferencia) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.String> saveReconciliacao(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Reconciliacao reconciliacao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.String> saveDesligamento(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Desligamento desligamento) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<br.com.pibsantalucia.model.Pastoral> pastoral() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.String> saveDeviceMobile(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.DeviceMobile deviceMobile) {
        return null;
    }
    
    public PessoaRepository() {
        super();
    }
}