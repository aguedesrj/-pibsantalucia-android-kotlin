package br.com.pibsantalucia.ui.registerpessoa.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00050\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsAdapter$ViewHolder;", "listContact", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/Contact;", "contactsFragment", "Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsFragment;", "(Ljava/util/ArrayList;Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsFragment;)V", "onClickSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ContactsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsAdapter.ViewHolder> {
    private final io.reactivex.subjects.PublishSubject<br.com.pibsantalucia.model.Contact> onClickSubject = null;
    private final java.util.ArrayList<br.com.pibsantalucia.model.Contact> listContact = null;
    private final br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsFragment contactsFragment = null;
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public ContactsAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.com.pibsantalucia.model.Contact> listContact, @org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsFragment contactsFragment) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "contact", "Lbr/com/pibsantalucia/model/Contact;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bindData(@org.jetbrains.annotations.NotNull
        br.com.pibsantalucia.model.Contact contact) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
}