package br.com.pibsantalucia.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH\'J8\u0010\r\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J8\u0010\u0011\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J(\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J2\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\nH\'J2\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\'J2\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\'J2\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\'J2\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010 \u001a\u00020!H\'J2\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010#\u001a\u00020$H\'J2\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\'\u001a\u00020\u0007H\'\u00a8\u0006("}, d2 = {"Lbr/com/pibsantalucia/repository/IPessoaRepository;", "", "getPastoral", "Lretrofit2/Call;", "Lbr/com/pibsantalucia/model/ResponsePayload;", "Lbr/com/pibsantalucia/model/Pastoral;", "token", "", "contentType", "getPerson", "Lbr/com/pibsantalucia/model/Person;", "pesCodigo", "", "listAniversariantes", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/ListPeople;", "Lkotlin/collections/ArrayList;", "listPeoples", "prepareRegistration", "Lbr/com/pibsantalucia/model/PrepareRegistration;", "save", "person", "saveDesligamento", "desligamento", "Lbr/com/pibsantalucia/model/Desligamento;", "saveDeviceMobile", "deviceMobile", "Lbr/com/pibsantalucia/model/DeviceMobile;", "saveObito", "obito", "Lbr/com/pibsantalucia/model/Obito;", "saveReconciliacao", "reconciliacao", "Lbr/com/pibsantalucia/model/Reconciliacao;", "saveTransferencia", "transferencia", "Lbr/com/pibsantalucia/model/Transferencia;", "searchForCep", "Lbr/com/pibsantalucia/model/ViaCep;", "cep", "app_release"})
@br.com.pibsantalucia.api.URLBase(value = "http://ec2-52-15-178-77.us-east-2.compute.amazonaws.com/Api/")
public abstract interface IPessoaRepository {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "PessoaRest/GetAniversariantes")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.util.ArrayList<br.com.pibsantalucia.model.ListPeople>>> listAniversariantes(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "PessoaRest/GetLista")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.util.ArrayList<br.com.pibsantalucia.model.ListPeople>>> listPeoples(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "PessoaRest/GetPreparaCadastro")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<br.com.pibsantalucia.model.PrepareRegistration>> prepareRegistration(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "PessoaRest/GetCep")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<br.com.pibsantalucia.model.ViaCep>> searchForCep(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "cep")
    java.lang.String cep);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "PessoaRest/GetMembro")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<br.com.pibsantalucia.model.Person>> getPerson(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @retrofit2.http.Query(value = "pesCodigo")
    long pesCodigo);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "PessoaRest/SavePerson")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.lang.String>> save(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    br.com.pibsantalucia.model.Person person);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "PessoaRest/SaveObito")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.lang.String>> saveObito(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    br.com.pibsantalucia.model.Obito obito);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "PessoaRest/SaveTransferencia")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.lang.String>> saveTransferencia(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    br.com.pibsantalucia.model.Transferencia transferencia);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "PessoaRest/SaveReconciliacao")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.lang.String>> saveReconciliacao(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    br.com.pibsantalucia.model.Reconciliacao reconciliacao);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "PessoaRest/SaveDesligamento")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.lang.String>> saveDesligamento(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    br.com.pibsantalucia.model.Desligamento desligamento);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "PessoaRest/GetPastoral")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<br.com.pibsantalucia.model.Pastoral>> getPastoral(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "PessoaRest/SaveDeviceMobile")
    public abstract retrofit2.Call<br.com.pibsantalucia.model.ResponsePayload<java.lang.String>> saveDeviceMobile(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authentication")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    br.com.pibsantalucia.model.DeviceMobile deviceMobile);
}