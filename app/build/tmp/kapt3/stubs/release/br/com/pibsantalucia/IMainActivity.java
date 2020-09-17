package br.com.pibsantalucia;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lbr/com/pibsantalucia/IMainActivity;", "", "fail", "", "message", "", "success", "person", "Lbr/com/pibsantalucia/model/Person;", "app_release"})
public abstract interface IMainActivity {
    
    public abstract void success(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Person person);
    
    public abstract void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message);
}