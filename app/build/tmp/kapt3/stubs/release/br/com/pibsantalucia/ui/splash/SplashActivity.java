package br.com.pibsantalucia.ui.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u0007H\u0014J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/pibsantalucia/ui/splash/SplashActivity;", "Lbr/com/pibsantalucia/ui/base/BaseActivity;", "Lbr/com/pibsantalucia/ui/splash/ISplashActivity;", "()V", "model", "Lbr/com/pibsantalucia/ui/splash/SplashViewModel;", "delay", "", "fail", "message", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "success", "user", "Lbr/com/pibsantalucia/model/User;", "app_release"})
public final class SplashActivity extends br.com.pibsantalucia.ui.base.BaseActivity implements br.com.pibsantalucia.ui.splash.ISplashActivity {
    private br.com.pibsantalucia.ui.splash.SplashViewModel model;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void delay() {
    }
    
    @java.lang.Override
    public void success(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.User user) {
    }
    
    @java.lang.Override
    public void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    public SplashActivity() {
        super();
    }
}