package br.com.pibsantalucia.ui.changepassword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lbr/com/pibsantalucia/ui/changepassword/ChangePasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "repository", "Lbr/com/pibsantalucia/repository/LoginRepository;", "view", "Lbr/com/pibsantalucia/ui/changepassword/IChangePasswordActivity;", "getView", "()Lbr/com/pibsantalucia/ui/changepassword/IChangePasswordActivity;", "setView", "(Lbr/com/pibsantalucia/ui/changepassword/IChangePasswordActivity;)V", "changePassword", "", "cpfOrEmail", "", "passwordNew", "passwordNewConfirmation", "app_release"})
public final class ChangePasswordViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.pibsantalucia.repository.LoginRepository repository = null;
    @org.jetbrains.annotations.NotNull
    public br.com.pibsantalucia.ui.changepassword.IChangePasswordActivity view;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.pibsantalucia.ui.changepassword.IChangePasswordActivity getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.ui.changepassword.IChangePasswordActivity p0) {
    }
    
    public final void changePassword(@org.jetbrains.annotations.NotNull
    java.lang.String cpfOrEmail, @org.jetbrains.annotations.NotNull
    java.lang.String passwordNew, @org.jetbrains.annotations.NotNull
    java.lang.String passwordNewConfirmation) {
    }
    
    public ChangePasswordViewModel() {
        super();
    }
}