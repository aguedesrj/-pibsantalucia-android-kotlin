package br.com.pibsantalucia.ui.registerpessoa.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsFragment;", "Lbr/com/pibsantalucia/ui/base/BaseFragment;", "()V", "contactAlter", "Lbr/com/pibsantalucia/model/Contact;", "contactsAdapter", "Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsAdapter;", "listContact", "Ljava/util/ArrayList;", "listContactRemove", "listTypeContacts", "Lbr/com/pibsantalucia/model/TypeContact;", "getListTypeContacts", "()Ljava/util/ArrayList;", "setListTypeContacts", "(Ljava/util/ArrayList;)V", "person", "Lbr/com/pibsantalucia/model/Person;", "getPerson", "()Lbr/com/pibsantalucia/model/Person;", "setPerson", "(Lbr/com/pibsantalucia/model/Person;)V", "typeContactSelected", "viewModel", "Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsViewModel;", "assignValuesToPerson", "assignValuesToScreen", "", "init", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "pressEditContact", "contact", "pressRemoveContact", "Companion", "app_release"})
public final class ContactsFragment extends br.com.pibsantalucia.ui.base.BaseFragment {
    private br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsViewModel viewModel;
    private br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsAdapter contactsAdapter;
    private br.com.pibsantalucia.model.TypeContact typeContactSelected;
    private java.util.ArrayList<br.com.pibsantalucia.model.Contact> listContact;
    private br.com.pibsantalucia.model.Contact contactAlter;
    private java.util.ArrayList<br.com.pibsantalucia.model.Contact> listContactRemove;
    @org.jetbrains.annotations.Nullable
    private br.com.pibsantalucia.model.Person person;
    @org.jetbrains.annotations.Nullable
    private java.util.ArrayList<br.com.pibsantalucia.model.TypeContact> listTypeContacts;
    public static final br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable
    public final br.com.pibsantalucia.model.Person getPerson() {
        return null;
    }
    
    public final void setPerson(@org.jetbrains.annotations.Nullable
    br.com.pibsantalucia.model.Person p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<br.com.pibsantalucia.model.TypeContact> getListTypeContacts() {
        return null;
    }
    
    public final void setListTypeContacts(@org.jetbrains.annotations.Nullable
    java.util.ArrayList<br.com.pibsantalucia.model.TypeContact> p0) {
    }
    
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
    
    private final void init() {
    }
    
    public final void pressEditContact(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Contact contact) {
    }
    
    public final void pressRemoveContact(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Contact contact) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.model.Person assignValuesToPerson() {
        return null;
    }
    
    private final void assignValuesToScreen() {
    }
    
    public ContactsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsFragment$Companion;", "", "()V", "newInstance", "Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsFragment;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull
        public final br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}