package br.com.pibsantalucia.ui.escala;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010\u0019\u001a\u00020\u00122\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lbr/com/pibsantalucia/ui/escala/EscalaViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "repository", "Lbr/com/pibsantalucia/repository/EscalaRepository;", "getRepository$app_debug", "()Lbr/com/pibsantalucia/repository/EscalaRepository;", "repositoryPesssoa", "Lbr/com/pibsantalucia/repository/PessoaRepository;", "getRepositoryPesssoa$app_debug", "()Lbr/com/pibsantalucia/repository/PessoaRepository;", "view", "Lbr/com/pibsantalucia/ui/escala/IEscalaFragment;", "getView", "()Lbr/com/pibsantalucia/ui/escala/IEscalaFragment;", "setView", "(Lbr/com/pibsantalucia/ui/escala/IEscalaFragment;)V", "getPerson", "", "pesCodigo", "", "listPeoples", "lista", "escFlgTipo", "", "salvar", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/EscalaMeses;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class EscalaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final br.com.pibsantalucia.repository.EscalaRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.pibsantalucia.repository.PessoaRepository repositoryPesssoa = null;
    @org.jetbrains.annotations.NotNull
    public br.com.pibsantalucia.ui.escala.IEscalaFragment view;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.repository.EscalaRepository getRepository$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.repository.PessoaRepository getRepositoryPesssoa$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.ui.escala.IEscalaFragment getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.escala.IEscalaFragment p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void lista(int escFlgTipo) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void listPeoples() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getPerson(long pesCodigo) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void salvar(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.EscalaMeses> lista) {
    }
    
    public EscalaViewModel() {
        super();
    }
}