package br.com.pibsantalucia

import android.app.Application
import androidx.room.Room
import br.com.pibsantalucia.repository.AppDataBase
import com.facebook.stetho.Stetho

open class PibSantaLuciaApplication : Application() {

    companion object {
        var database: AppDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()
        //Room
        database = Room.databaseBuilder(this,
            AppDataBase::class.java, "pibsantalucia-db")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries().build()

        //Stetho
        val initializerBuilder = Stetho.newInitializerBuilder(this)
        initializerBuilder.enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
        val initializer = initializerBuilder.build()
        Stetho.initialize(initializer)
    }
}