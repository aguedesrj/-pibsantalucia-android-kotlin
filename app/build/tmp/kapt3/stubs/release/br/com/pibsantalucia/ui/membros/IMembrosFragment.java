package br.com.pibsantalucia.ui.membros;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J \u0010\u0007\u001a\u00020\u00032\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH&\u00a8\u0006\u000e"}, d2 = {"Lbr/com/pibsantalucia/ui/membros/IMembrosFragment;", "", "fail", "", "message", "", "failList", "success", "person", "Lbr/com/pibsantalucia/model/Person;", "list", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/ListPeople;", "Lkotlin/collections/ArrayList;", "app_release"})
public abstract interface IMembrosFragment {
    
    public abstract void success(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Person person);
    
    public abstract void success(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> list);
    
    public abstract void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message);
    
    public abstract void failList(@org.jetbrains.annotations.NotNull
    java.lang.String message);
}