package br.com.pibsantalucia.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
class User {
    @PrimaryKey
    @ColumnInfo(name = "pesCodigo")
    var pesCodigo: Long = 0
    @ColumnInfo(name = "cpfOrEmail")
    var cpfOrEmail: String = ""
    @ColumnInfo(name = "umeSenha")
    var umeSenha: String = ""
    @ColumnInfo(name = "umeSenhaTemp")
    var umeSenhaTemp: Boolean = false
    @ColumnInfo(name = "pesNome")
    var pesNome: String = ""
    @ColumnInfo(name = "perCodigo")
    var perCodigo: Int = 0
    @ColumnInfo(name = "urlPhoto")
    var urlPhoto: String? = null
    @ColumnInfo(name = "token")
    var token: String = ""
}