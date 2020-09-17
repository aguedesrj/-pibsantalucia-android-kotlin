package br.com.pibsantalucia.ui.registerpessoa;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\"\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0012\u00101\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0016J-\u0010;\u001a\u00020(2\u0006\u0010,\u001a\u00020-2\u000e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0=2\u0006\u0010>\u001a\u00020?H\u0016\u00a2\u0006\u0002\u0010@J\b\u0010A\u001a\u00020(H\u0014J\b\u0010B\u001a\u000205H\u0016J\b\u0010C\u001a\u00020(H\u0002J\u0010\u0010D\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006E"}, d2 = {"Lbr/com/pibsantalucia/ui/registerpessoa/RegisterPessoaActivity;", "Lbr/com/pibsantalucia/ui/base/BaseActivity;", "Lbr/com/pibsantalucia/ui/registerpessoa/IRegisterPessoaActivity;", "()V", "activeFragment", "Landroidx/fragment/app/Fragment;", "addressFragment", "Lbr/com/pibsantalucia/ui/registerpessoa/fragment/AddressFragment;", "contactsFragment", "Lbr/com/pibsantalucia/ui/registerpessoa/fragment/ContactsFragment;", "dataPersonalFragment", "Lbr/com/pibsantalucia/ui/registerpessoa/fragment/DataPersonalFragment;", "fm", "Landroidx/fragment/app/FragmentManager;", "listTypeContact", "Ljava/util/ArrayList;", "Lbr/com/pibsantalucia/model/TypeContact;", "getListTypeContact", "()Ljava/util/ArrayList;", "setListTypeContact", "(Ljava/util/ArrayList;)V", "mCropImageUri", "Landroid/net/Uri;", "getMCropImageUri", "()Landroid/net/Uri;", "setMCropImageUri", "(Landroid/net/Uri;)V", "model", "Lbr/com/pibsantalucia/ui/registerpessoa/RegisterPessoaViewModel;", "moreInformationFragment", "Lbr/com/pibsantalucia/ui/registerpessoa/fragment/MoreInformationFragment;", "navigation", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "person", "Lbr/com/pibsantalucia/model/Person;", "getPerson", "()Lbr/com/pibsantalucia/model/Person;", "setPerson", "(Lbr/com/pibsantalucia/model/Person;)V", "fail", "", "message", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "onSupportNavigateUp", "saveCongregado", "success", "app_debug"})
public final class RegisterPessoaActivity extends br.com.pibsantalucia.ui.base.BaseActivity implements br.com.pibsantalucia.ui.registerpessoa.IRegisterPessoaActivity {
    private br.com.pibsantalucia.ui.registerpessoa.fragment.DataPersonalFragment dataPersonalFragment;
    private br.com.pibsantalucia.ui.registerpessoa.fragment.MoreInformationFragment moreInformationFragment;
    private br.com.pibsantalucia.ui.registerpessoa.fragment.AddressFragment addressFragment;
    private br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsFragment contactsFragment;
    private androidx.fragment.app.FragmentManager fm;
    private com.google.android.material.bottomnavigation.BottomNavigationView navigation;
    private androidx.fragment.app.Fragment activeFragment;
    private br.com.pibsantalucia.ui.registerpessoa.RegisterPessoaViewModel model;
    @org.jetbrains.annotations.Nullable
    private java.util.ArrayList<br.com.pibsantalucia.model.TypeContact> listTypeContact;
    @org.jetbrains.annotations.Nullable
    private br.com.pibsantalucia.model.Person person;
    @org.jetbrains.annotations.Nullable
    private android.net.Uri mCropImageUri;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<br.com.pibsantalucia.model.TypeContact> getListTypeContact() {
        return null;
    }
    
    public final void setListTypeContact(@org.jetbrains.annotations.Nullable
    java.util.ArrayList<br.com.pibsantalucia.model.TypeContact> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final br.com.pibsantalucia.model.Person getPerson() {
        return null;
    }
    
    public final void setPerson(@org.jetbrains.annotations.Nullable
    br.com.pibsantalucia.model.Person p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getMCropImageUri() {
        return null;
    }
    
    public final void setMCropImageUri(@org.jetbrains.annotations.Nullable
    android.net.Uri p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void saveCongregado() {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    public void success(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public RegisterPessoaActivity() {
        super();
    }
}