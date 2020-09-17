package br.com.pibsantalucia.ui.listpessoa;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020#H\u0016J\u0018\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020#H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lbr/com/pibsantalucia/ui/listpessoa/ListPessoaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/pibsantalucia/ui/listpessoa/ListPessoaAdapter$ViewHolder;", "()V", "imageViewSetaGone", "", "getImageViewSetaGone", "()Z", "setImageViewSetaGone", "(Z)V", "list", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/ListPeople;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "listFilter", "getListFilter", "setListFilter", "listFull", "getListFull", "setListFull", "listener", "Lbr/com/pibsantalucia/ui/listpessoa/OnItemClickCongregadoListener;", "getListener", "()Lbr/com/pibsantalucia/ui/listpessoa/OnItemClickCongregadoListener;", "setListener", "(Lbr/com/pibsantalucia/ui/listpessoa/OnItemClickCongregadoListener;)V", "filter", "", "characterText", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class ListPessoaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.pibsantalucia.ui.listpessoa.ListPessoaAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> list;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> listFull;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> listFilter;
    @org.jetbrains.annotations.Nullable
    private br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener listener;
    private boolean imageViewSetaGone;
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> getListFull() {
        return null;
    }
    
    public final void setListFull(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> getListFilter() {
        return null;
    }
    
    public final void setListFilter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener p0) {
    }
    
    public final boolean getImageViewSetaGone() {
        return false;
    }
    
    public final void setImageViewSetaGone(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.pibsantalucia.ui.listpessoa.ListPessoaAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.listpessoa.ListPessoaAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull
    java.lang.String characterText) {
    }
    
    public ListPessoaAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lbr/com/pibsantalucia/ui/listpessoa/ListPessoaAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "people", "Lbr/com/pibsantalucia/model/ListPeople;", "app_release"})
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