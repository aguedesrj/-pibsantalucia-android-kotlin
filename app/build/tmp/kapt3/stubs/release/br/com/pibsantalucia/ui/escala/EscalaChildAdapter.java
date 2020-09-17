package br.com.pibsantalucia.ui.escala;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lbr/com/pibsantalucia/ui/escala/EscalaChildAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/pibsantalucia/ui/escala/EscalaChildAdapter$ViewHolder;", "()V", "escala", "Lbr/com/pibsantalucia/model/Escala;", "getEscala", "()Lbr/com/pibsantalucia/model/Escala;", "setEscala", "(Lbr/com/pibsantalucia/model/Escala;)V", "listener", "Lbr/com/pibsantalucia/ui/escala/OnClickEscalaChildListener;", "getListener", "()Lbr/com/pibsantalucia/ui/escala/OnClickEscalaChildListener;", "setListener", "(Lbr/com/pibsantalucia/ui/escala/OnClickEscalaChildListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class EscalaChildAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.pibsantalucia.ui.escala.EscalaChildAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private br.com.pibsantalucia.model.Escala escala;
    @org.jetbrains.annotations.Nullable
    private br.com.pibsantalucia.ui.escala.OnClickEscalaChildListener listener;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.model.Escala getEscala() {
        return null;
    }
    
    public final void setEscala(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Escala p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.pibsantalucia.ui.escala.OnClickEscalaChildListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    br.com.pibsantalucia.ui.escala.OnClickEscalaChildListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.pibsantalucia.ui.escala.EscalaChildAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.escala.EscalaChildAdapter.ViewHolder holder, int position) {
    }
    
    public EscalaChildAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lbr/com/pibsantalucia/ui/escala/EscalaChildAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "people", "Lbr/com/pibsantalucia/model/ListPeople;", "app_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bindData(@org.jetbrains.annotations.NotNull
        br.com.pibsantalucia.model.ListPeople people) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
}