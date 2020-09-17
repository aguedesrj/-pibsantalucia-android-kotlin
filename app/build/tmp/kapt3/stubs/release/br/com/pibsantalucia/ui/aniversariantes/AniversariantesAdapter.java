package br.com.pibsantalucia.ui.aniversariantes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lbr/com/pibsantalucia/ui/aniversariantes/AniversariantesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/pibsantalucia/ui/aniversariantes/AniversariantesAdapter$ViewHolder;", "()V", "list", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/ListPeople;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "listener", "Lbr/com/pibsantalucia/ui/listpessoa/OnItemClickCongregadoListener;", "getListener", "()Lbr/com/pibsantalucia/ui/listpessoa/OnItemClickCongregadoListener;", "setListener", "(Lbr/com/pibsantalucia/ui/listpessoa/OnItemClickCongregadoListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class AniversariantesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.pibsantalucia.ui.aniversariantes.AniversariantesAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> list;
    @org.jetbrains.annotations.Nullable
    private br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener listener;
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.pibsantalucia.ui.aniversariantes.AniversariantesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.aniversariantes.AniversariantesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public AniversariantesAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lbr/com/pibsantalucia/ui/aniversariantes/AniversariantesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "people", "Lbr/com/pibsantalucia/model/ListPeople;", "app_release"})
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