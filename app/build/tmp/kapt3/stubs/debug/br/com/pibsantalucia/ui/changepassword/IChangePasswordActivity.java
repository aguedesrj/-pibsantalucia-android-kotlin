package br.com.pibsantalucia.ui.changepassword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lbr/com/pibsantalucia/ui/changepassword/IChangePasswordActivity;", "", "fail", "", "message", "", "showErrorNewPassword", "", "showErrorNewPasswordConfirmation", "success", "user", "Lbr/com/pibsantalucia/model/User;", "app_debug"})
public abstract interface IChangePasswordActivity {
    
    public abstract void showErrorNewPassword(int message);
    
    public abstract void showErrorNewPasswordConfirmation(int message);
    
    public abstract void success(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.User user);
    
    public abstract void fail(@org.jetbrains.annotations.NotNull
    java.lang.String message);
}