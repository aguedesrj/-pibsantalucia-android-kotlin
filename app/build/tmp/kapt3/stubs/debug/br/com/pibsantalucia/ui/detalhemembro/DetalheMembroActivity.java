package br.com.pibsantalucia.ui.detalhemembro;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bH\u0016J-\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lbr/com/pibsantalucia/ui/detalhemembro/DetalheMembroActivity;", "Lbr/com/pibsantalucia/ui/base/BaseActivity;", "Lbr/com/pibsantalucia/ui/detalhemembro/IDetalheMembroActivity;", "Lbr/com/pibsantalucia/ui/detalhemembro/OnItemClickContact;", "()V", "adapter", "Lbr/com/pibsantalucia/ui/detalhemembro/DetalheMembroAdapter;", "contactSelected", "Lbr/com/pibsantalucia/model/Contact;", "person", "Lbr/com/pibsantalucia/model/Person;", "callPhone", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClickPhone", "contact", "onItemClickWhatsApp", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSupportNavigateUp", "", "app_debug"})
public final class DetalheMembroActivity extends br.com.pibsantalucia.ui.base.BaseActivity implements br.com.pibsantalucia.ui.detalhemembro.IDetalheMembroActivity, br.com.pibsantalucia.ui.detalhemembro.OnItemClickContact {
    private br.com.pibsantalucia.model.Person person;
    private br.com.pibsantalucia.ui.detalhemembro.DetalheMembroAdapter adapter;
    private br.com.pibsantalucia.model.Contact contactSelected;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override
    public void onItemClickWhatsApp(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Contact contact) {
    }
    
    @java.lang.Override
    public void onItemClickPhone(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Contact contact) {
    }
    
    private final void callPhone() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    public DetalheMembroActivity() {
        super();
    }
}