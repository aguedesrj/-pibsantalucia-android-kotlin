package br.com.pibsantalucia.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0018\u0010\u0011\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lbr/com/pibsantalucia/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "progress", "Landroid/app/ProgressDialog;", "getProgress", "()Landroid/app/ProgressDialog;", "setProgress", "(Landroid/app/ProgressDialog;)V", "hasConnectivity", "", "showError", "hideLoading", "", "loading", "message", "", "showMessage", "listener", "Landroid/content/DialogInterface$OnClickListener;", "app_release"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable
    private android.app.ProgressDialog progress;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable
    public final android.app.ProgressDialog getProgress() {
        return null;
    }
    
    public final void setProgress(@org.jetbrains.annotations.Nullable
    android.app.ProgressDialog p0) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.Nullable
    java.lang.String message) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.NotNull
    android.content.DialogInterface.OnClickListener listener) {
    }
    
    public final void loading() {
    }
    
    public final void loading(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public final void hideLoading() {
    }
    
    public final boolean hasConnectivity(boolean showError) {
        return false;
    }
    
    public BaseActivity() {
        super();
    }
}