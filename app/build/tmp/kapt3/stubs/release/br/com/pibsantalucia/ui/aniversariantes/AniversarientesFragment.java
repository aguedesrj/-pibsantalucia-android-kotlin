package br.com.pibsantalucia.ui.aniversariantes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'H\u0016J \u0010%\u001a\u00020\u00142\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020$0)j\b\u0012\u0004\u0012\u00020$`*H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lbr/com/pibsantalucia/ui/aniversariantes/AniversarientesFragment;", "Lbr/com/pibsantalucia/ui/base/BaseFragment;", "Lbr/com/pibsantalucia/ui/membros/IMembrosFragment;", "Lbr/com/pibsantalucia/ui/listpessoa/OnItemClickCongregadoListener;", "()V", "adapter", "Lbr/com/pibsantalucia/ui/aniversariantes/AniversariantesAdapter;", "button", "Landroidx/appcompat/widget/AppCompatButton;", "constraintLayoutMessage", "Landroidx/constraintlayout/widget/ConstraintLayout;", "progressBar", "Landroidx/core/widget/ContentLoadingProgressBar;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "textViewMessage", "Landroid/widget/TextView;", "viewModel", "Lbr/com/pibsantalucia/ui/aniversariantes/AniversarientesViewModel;", "fail", "", "message", "", "failList", "getListAniversariantes", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClick", "people", "Lbr/com/pibsantalucia/model/ListPeople;", "success", "person", "Lbr/com/pibsantalucia/model/Person;", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Companion", "app_release"})
public final class AniversarientesFragment extends br.com.pibsantalucia.ui.base.BaseFragment implements br.com.pibsantalucia.ui.membros.IMembrosFragment, br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener {
    private androidx.constraintlayout.widget.ConstraintLayout constraintLayoutMessage;
    private androidx.core.widget.ContentLoadingProgressBar progressBar;
    private androidx.appcompat.widget.AppCompatButton button;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.TextView textViewMessage;
    private br.com.pibsantalucia.ui.aniversariantes.AniversariantesAdapter adapter;
    private br.com.pibsantalucia.ui.aniversariantes.AniversarientesViewModel viewModel;
    public static final br.com.pibsantalucia.ui.aniversariantes.AniversarientesFragment.Companion Companion = null;
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
    
    private final void getListAniversariantes() {
    }
    
    @java.lang.Override
    public void success(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Person person) {
    }
    
    @java.lang.Override
    public void success(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.ListPeople> list) {
    }
    
    @java.lang.Override
    public void failList(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.ListPeople people) {
    }
    
    public AniversarientesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lbr/com/pibsantalucia/ui/aniversariantes/AniversarientesFragment$Companion;", "", "()V", "newInstance", "Lbr/com/pibsantalucia/ui/aniversariantes/AniversarientesFragment;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull
        public final br.com.pibsantalucia.ui.aniversariantes.AniversarientesFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}