package br.com.pibsantalucia;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/pibsantalucia/PibSantaLuciaApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public class PibSantaLuciaApplication extends android.app.Application {
    @org.jetbrains.annotations.Nullable
    private static br.com.pibsantalucia.repository.AppDataBase database;
    public static final br.com.pibsantalucia.PibSantaLuciaApplication.Companion Companion = null;
    
    @java.lang.Override
    public void onCreate() {
    }
    
    public PibSantaLuciaApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lbr/com/pibsantalucia/PibSantaLuciaApplication$Companion;", "", "()V", "database", "Lbr/com/pibsantalucia/repository/AppDataBase;", "getDatabase", "()Lbr/com/pibsantalucia/repository/AppDataBase;", "setDatabase", "(Lbr/com/pibsantalucia/repository/AppDataBase;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable
        public final br.com.pibsantalucia.repository.AppDataBase getDatabase() {
            return null;
        }
        
        public final void setDatabase(@org.jetbrains.annotations.Nullable
        br.com.pibsantalucia.repository.AppDataBase p0) {
        }
        
        private Companion() {
            super();
        }
    }
}