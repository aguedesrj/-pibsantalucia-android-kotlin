package br.com.pibsantalucia.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0018\u0010\n\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbr/com/pibsantalucia/ui/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "progress", "Landroid/app/ProgressDialog;", "hideLoading", "", "loading", "message", "", "showMessage", "listener", "Landroid/content/DialogInterface$OnClickListener;", "app_release"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    private android.app.ProgressDialog progress;
    private java.util.HashMap _$_findViewCache;
    
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
    
    public BaseFragment() {
        super();
    }
}