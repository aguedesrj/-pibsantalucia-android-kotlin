package br.com.pibsantalucia.ui.escala;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH&J \u0010\u000b\u001a\u00020\u00032\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\nH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0012"}, d2 = {"Lbr/com/pibsantalucia/ui/escala/IEscalaFragment;", "", "fail", "", "message", "", "success", "lista", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/EscalaMeses;", "Lkotlin/collections/ArrayList;", "successListPeople", "list", "Lbr/com/pibsantalucia/model/ListPeople;", "successPerson", "person", "Lbr/com/pibsantalucia/model/Person;", "successSalvar", "app_debug"})
public abstract interface IEscalaFragment {
    
    public abstract void success(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.EscalaMeses> lista);
    
    public abstract void successListPeople(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> list);
    
    public abstract void successPerson(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Person person);
    
    public abstract void successSalvar(@org.jetbrains.annotations.NotNull
    java.lang.String message);
    
    public abstract void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message);
}