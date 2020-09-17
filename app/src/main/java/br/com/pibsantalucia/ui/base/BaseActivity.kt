package br.com.pibsantalucia.ui.base

import android.app.Activity
import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import android.content.DialogInterface
import android.net.ConnectivityManager
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import br.com.pibsantalucia.R
import br.com.pibsantalucia.api.Constants
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import com.sun.xml.bind.Util
import kotlinx.android.synthetic.main.activity_forgot_password.*

abstract class BaseActivity : AppCompatActivity() {

    var progress: ProgressDialog? = null

    fun showMessage(message: String?) {
        hideLoading()
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setTitle("")
        alertDialogBuilder
            .setCancelable(false)
            .setNegativeButton(resources.getString(R.string.dialog_neutral_button)) { dialog, id ->

            }

        val alertD = alertDialogBuilder.create()
        alertD.show()
    }

    fun showMessage(message: String?, listener: DialogInterface.OnClickListener) {
        hideLoading()
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setTitle("")
        alertDialogBuilder
            .setCancelable(false)
            .setNegativeButton(resources.getString(R.string.dialog_neutral_button)) { dialog, id ->
                listener.onClick(dialog, id)
            }

        val alertD = alertDialogBuilder.create()
        alertD.show()
    }

    fun loading() {
        progress = ProgressDialog(this, R.style.AppCompatAlertDialogStyle)
        progress?.setTitle("")
        progress?.setMessage(this.getString(R.string.text_loading))
        progress?.setCancelable(false)
        progress?.show()
    }

    fun loading(message: String) {

        progress = ProgressDialog(this, R.style.AppCompatAlertDialogStyle)
        progress?.setTitle("")
        progress?.setMessage(message)
        progress?.setCancelable(false)
        progress?.show()

    }

    fun hideLoading() {
        if (progress != null) {
            progress?.dismiss()
            progress?.cancel()
        }
    }

    fun hasConnectivity(showError: Boolean): Boolean {
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val netInfo = cm.activeNetworkInfo
        if (netInfo == null || !cm.activeNetworkInfo.isAvailable
            || !cm.activeNetworkInfo.isConnected
        ) {
            if (showError) {
                showMessage(Constants.MSG_CONNECTION_NOT_AVAILABLE)
            }
            return false
        }
        return true
    }
}