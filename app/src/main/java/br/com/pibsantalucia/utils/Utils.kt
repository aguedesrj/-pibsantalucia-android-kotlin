package br.com.pibsantalucia.utils

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Base64
import android.view.View
import android.view.ViewTreeObserver
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.core.content.ContextCompat
import br.com.pibsantalucia.PibSantaLuciaApplication
import br.com.pibsantalucia.R
import com.google.firebase.analytics.FirebaseAnalytics
import java.io.ByteArrayOutputStream
import java.text.SimpleDateFormat
import java.util.*

    fun isDataValida(valor: String): Boolean {
        try {
            var simpleDateFormat: SimpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
            simpleDateFormat.parse(valor)
            return true
        } catch (exception: Exception) {
            return false
        }
    }

    fun isDataMaiorQueAtual(valor: String): Boolean {
        try {
            var simpleDateFormat: SimpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
            var dataAtual: Calendar = Calendar.getInstance()
            var dataInformada: Calendar = Calendar.getInstance()
            dataInformada.time = simpleDateFormat.parse(valor)

            return dataInformada.before(dataAtual)
        } catch (exception: Exception) {
            return false
        }
    }

    fun convertBase64(bitmap: Bitmap): String {
        var stream: ByteArrayOutputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
        return Base64.encodeToString(stream.toByteArray(), Base64.DEFAULT)
    }

    fun isCampoPreenchido(valor: String): Boolean {
        return (valor != null && !"".toString().equals(valor.trim()))
    }

    fun resizedBitmap(bm: Bitmap): Bitmap {
        val maxSize = 250
        val outWidth: Int
        val outHeight: Int
        val inWidth = bm.width
        val inHeight = bm.height
        if (inWidth > inHeight) {
            outWidth = maxSize
            outHeight = inHeight * maxSize / inWidth
        } else {
            outHeight = maxSize
            outWidth = inWidth * maxSize / inHeight
        }
        return Bitmap.createScaledBitmap(bm, outWidth, outHeight, false)
    }

    fun hideSoftKeyBoard(view: View) {
        val imm = ContextCompat.getSystemService(view!!.context, InputMethodManager::class.java)
        imm?.hideSoftInputFromWindow(view!!.windowToken, 0)
    }

    fun hideSoftKeyBoard(context: Context, view: View) {
        try {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm?.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun isPerfilSecretaria(): Boolean {
        val user = PibSantaLuciaApplication.database?.userDao()?.getUser()!!
        if (user!!.perCodigo == 2) {
            return true
        }
        return false
    }

    fun firebaseAnalyticsEvents(context: Context, screen: String, action: String) {
        val bundle = Bundle()
        bundle.putString("screen", screen)
        bundle.putString("action", action)
        FirebaseAnalytics.getInstance(context).logEvent("event", bundle)
    }