package br.com.pibsantalucia.repository

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.pibsantalucia.model.User

@Database(version = 3, entities = arrayOf(User::class), exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
}