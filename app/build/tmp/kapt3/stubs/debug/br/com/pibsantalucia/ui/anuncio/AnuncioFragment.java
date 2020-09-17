package br.com.pibsantalucia.ui.anuncio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0014H\u0016J \u0010-\u001a\u00020\u00142\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\'0/j\b\u0012\u0004\u0012\u00020\'`0H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lbr/com/pibsantalucia/ui/anuncio/AnuncioFragment;", "Lbr/com/pibsantalucia/ui/base/BaseFragment;", "Lbr/com/pibsantalucia/ui/anuncio/IAnuncioFragment;", "Lbr/com/pibsantalucia/ui/anuncio/OnItemClickAnuncio;", "()V", "adapter", "Lbr/com/pibsantalucia/ui/anuncio/AnuncioAdapter;", "button", "Landroidx/appcompat/widget/AppCompatButton;", "constraintLayoutMessage", "Landroidx/constraintlayout/widget/ConstraintLayout;", "progressBar", "Landroidx/core/widget/ContentLoadingProgressBar;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "textViewMessage", "Landroid/widget/TextView;", "viewModel", "Lbr/com/pibsantalucia/ui/anuncio/AnuncioViewModel;", "fail", "", "message", "", "getLista", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClick", "anuncio", "Lbr/com/pibsantalucia/model/Anuncio;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onStart", "success", "lista", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Companion", "app_debug"})
public final class AnuncioFragment extends br.com.pibsantalucia.ui.base.BaseFragment implements br.com.pibsantalucia.ui.anuncio.IAnuncioFragment, br.com.pibsantalucia.ui.anuncio.OnItemClickAnuncio {
    private androidx.constraintlayout.widget.ConstraintLayout constraintLayoutMessage;
    private androidx.core.widget.ContentLoadingProgressBar progressBar;
    private androidx.appcompat.widget.AppCompatButton button;
    private android.widget.TextView textViewMessage;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private br.com.pibsantalucia.ui.anuncio.AnuncioAdapter adapter;
    private br.com.pibsantalucia.ui.anuncio.AnuncioViewModel viewModel;
    public static final br.com.pibsantalucia.ui.anuncio.AnuncioFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onActivityCreated(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void getLista() {
    }
    
    @java.lang.Override
    public void success(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.Anuncio> lista) {
    }
    
    @java.lang.Override
    public void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Anuncio anuncio) {
    }
    
    public AnuncioFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lbr/com/pibsantalucia/ui/anuncio/AnuncioFragment$Companion;", "", "()V", "newInstance", "Lbr/com/pibsantalucia/ui/anuncio/AnuncioFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull
        public final br.com.pibsantalucia.ui.anuncio.AnuncioFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}