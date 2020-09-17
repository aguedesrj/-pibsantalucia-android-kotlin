package br.com.pibsantalucia.ui.aniversariantes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lbr/com/pibsantalucia/ui/aniversariantes/AniversarientesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "repository", "Lbr/com/pibsantalucia/repository/PessoaRepository;", "getRepository$app_debug", "()Lbr/com/pibsantalucia/repository/PessoaRepository;", "view", "Lbr/com/pibsantalucia/ui/membros/IMembrosFragment;", "getView", "()Lbr/com/pibsantalucia/ui/membros/IMembrosFragment;", "setView", "(Lbr/com/pibsantalucia/ui/membros/IMembrosFragment;)V", "getPerson", "", "pesCodigo", "", "listAniversariantes", "app_debug"})
public final class AniversarientesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final br.com.pibsantalucia.repository.PessoaRepository repository = null;
    @org.jetbrains.annotations.NotNull
    public br.com.pibsantalucia.ui.membros.IMembrosFragment view;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.repository.PessoaRepository getRepository$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.ui.membros.IMembrosFragment getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.membros.IMembrosFragment p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void listAniversariantes() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getPerson(long pesCodigo) {
    }
    
    public AniversarientesViewModel() {
        super();
    }
}