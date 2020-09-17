package br.com.pibsantalucia.repository;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\b\u0010\b\u001a\u00020\u0005H\'J!\u0010\t\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lbr/com/pibsantalucia/repository/UserDao;", "", "deleteUser", "", "user", "Lbr/com/pibsantalucia/model/User;", "getAllUsers", "", "getUser", "insertUser", "", "([Lbr/com/pibsantalucia/model/User;)V", "updateUser", "app_release"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM User")
    public abstract java.util.List<br.com.pibsantalucia.model.User> getAllUsers();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM User")
    public abstract br.com.pibsantalucia.model.User getUser();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUser(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.User... user);
    
    @androidx.room.Update
    public abstract void updateUser(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.User user);
    
    @androidx.room.Delete
    public abstract void deleteUser(@org.jetbrains.annotations.NotNull
    br.com.pibsantalucia.model.User user);
    
    @androidx.room.Query(value = "DELETE FROM User")
    public abstract void deleteUser();
}