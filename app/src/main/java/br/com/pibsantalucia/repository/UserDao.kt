package br.com.pibsantalucia.repository

import androidx.room.*
import br.com.pibsantalucia.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM User")
    fun getAllUsers(): List<User>

    @Query("SELECT * FROM User")
    fun getUser(): User

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(vararg user: User)

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)

    @Query("DELETE FROM User")
    fun deleteUser()
}