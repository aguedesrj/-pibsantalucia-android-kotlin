package br.com.pibsantalucia;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\nH\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u00065"}, d2 = {"Lbr/com/pibsantalucia/MainActivity;", "Lbr/com/pibsantalucia/ui/base/BaseActivity;", "Lbr/com/pibsantalucia/IMainActivity;", "Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;", "()V", "aToggle", "Landroidx/appcompat/app/ActionBarDrawerToggle;", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "checkedItemMenu", "", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "model", "Lbr/com/pibsantalucia/MainViewModel;", "<set-?>", "Lbr/com/pibsantalucia/model/User;", "user", "getUser", "()Lbr/com/pibsantalucia/model/User;", "setUser", "(Lbr/com/pibsantalucia/model/User;)V", "user$delegate", "Lkotlin/properties/ReadWriteProperty;", "fail", "", "message", "", "navigateToFragment", "fragmentToNavigate", "Landroidx/fragment/app/Fragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDrawerClosed", "drawerView", "Landroid/view/View;", "onDrawerOpened", "onDrawerSlide", "slideOffset", "", "onDrawerStateChanged", "newState", "onSupportNavigateUp", "", "showEscalaFragment", "Lbr/com/pibsantalucia/ui/escala/EscalaFragment;", "tipoEscala", "Lbr/com/pibsantalucia/ui/escala/TipoEscala;", "success", "person", "Lbr/com/pibsantalucia/model/Person;", "updateToken", "app_release"})
public final class MainActivity extends br.com.pibsantalucia.ui.base.BaseActivity implements br.com.pibsantalucia.IMainActivity, androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    private androidx.appcompat.app.ActionBarDrawerToggle aToggle;
    private int checkedItemMenu;
    private br.com.pibsantalucia.MainViewModel model;
    private final kotlin.properties.ReadWriteProperty user$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final br.com.pibsantalucia.model.User getUser() {
        return null;
    }
    
    private final void setUser(br.com.pibsantalucia.model.User p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final br.com.pibsantalucia.ui.escala.EscalaFragment showEscalaFragment(br.com.pibsantalucia.ui.escala.TipoEscala tipoEscala) {
        return null;
    }
    
    private final void updateToken() {
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void navigateToFragment(androidx.fragment.app.Fragment fragmentToNavigate) {
    }
    
    @java.lang.Override
    public void success(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.Person person) {
    }
    
    @java.lang.Override
    public void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void onDrawerStateChanged(int newState) {
    }
    
    @java.lang.Override
    public void onDrawerSlide(@org.jetbrains.annotations.NotNull
    android.view.View drawerView, float slideOffset) {
    }
    
    @java.lang.Override
    public void onDrawerClosed(@org.jetbrains.annotations.NotNull
    android.view.View drawerView) {
    }
    
    @java.lang.Override
    public void onDrawerOpened(@org.jetbrains.annotations.NotNull
    android.view.View drawerView) {
    }
    
    public MainActivity() {
        super();
    }
}