package br.com.pibsantalucia.ui.escala;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006("}, d2 = {"Lbr/com/pibsantalucia/ui/escala/EscalaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/pibsantalucia/ui/escala/EscalaAdapter$ViewHolder;", "Lbr/com/pibsantalucia/ui/escala/OnClickEscalaChildListener;", "()V", "adapterChild", "Lbr/com/pibsantalucia/ui/escala/EscalaChildAdapter;", "getAdapterChild", "()Lbr/com/pibsantalucia/ui/escala/EscalaChildAdapter;", "setAdapterChild", "(Lbr/com/pibsantalucia/ui/escala/EscalaChildAdapter;)V", "list", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/Escala;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "listener", "Lbr/com/pibsantalucia/ui/escala/OnClickEscalaListener;", "getListener", "()Lbr/com/pibsantalucia/ui/escala/OnClickEscalaListener;", "setListener", "(Lbr/com/pibsantalucia/ui/escala/OnClickEscalaListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClick", "escala", "membro", "Lbr/com/pibsantalucia/model/ListPeople;", "ViewHolder", "app_debug"})
public final class EscalaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.pibsantalucia.ui.escala.EscalaAdapter.ViewHolder> implements br.com.pibsantalucia.ui.escala.OnClickEscalaChildListener {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<br.com.pibsantalucia.model.Escala> list;
    @org.jetbrains.annotations.Nullable
    private br.com.pibsantalucia.ui.escala.OnClickEscalaListener listener;
    @org.jetbrains.annotations.NotNull
    private br.com.pibsantalucia.ui.escala.EscalaChildAdapter adapterChild;
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<br.com.pibsantalucia.model.Escala> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.Escala> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.pibsantalucia.ui.escala.OnClickEscalaListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    br.com.pibsantalucia.ui.escala.OnClickEscalaListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.ui.escala.EscalaChildAdapter getAdapterChild() {
        return null;
    }
    
    public final void setAdapterChild(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.escala.EscalaChildAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.pibsantalucia.ui.escala.EscalaAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.escala.EscalaAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Escala escala, @org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.ListPeople membro) {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.ListPeople membro) {
    }
    
    public EscalaAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lbr/com/pibsantalucia/ui/escala/EscalaAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "escala", "Lbr/com/pibsantalucia/model/Escala;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bindData(@org.jetbrains.annotations.NotNull
        br.com.pibsantalucia.model.Escala escala) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
}