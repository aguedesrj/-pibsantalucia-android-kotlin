package br.com.pibsantalucia.ui.escala;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lbr/com/pibsantalucia/ui/escala/OnClickEscalaListener;", "", "notifyDataSetChanged", "", "onItemClick", "escala", "Lbr/com/pibsantalucia/model/Escala;", "membro", "Lbr/com/pibsantalucia/model/ListPeople;", "app_release"})
public abstract interface OnClickEscalaListener {
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Escala escala);
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.ListPeople membro);
    
    public abstract void notifyDataSetChanged();
}