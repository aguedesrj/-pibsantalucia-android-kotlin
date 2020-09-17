package br.com.pibsantalucia.ui.base

import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.BroadcastReceiver
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import br.com.pibsantalucia.PibSantaLuciaApplication
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.repository.PessoaRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

abstract class BaseFragment: Fragment() {

    private lateinit var progress: ProgressDialog

    fun showMessage(message: String?) {
        hideLoading()
        val alertDialogBuilder = AlertDialog.Builder(activity)
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
        val alertDialogBuilder = AlertDialog.Builder(activity)
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
        progress = ProgressDialog(activity)
        progress.setTitle("")
        progress.setMessage(this.getString(R.string.text_loading))
        progress.setCancelable(false)
        progress.show()
    }

    fun loading(message: String) {

        progress = ProgressDialog(activity)
        progress.setTitle("")
        progress.setMessage(message)
        progress.setCancelable(false)
        progress.show()

    }

    fun hideLoading() {
        if (progress != null) {
            progress.dismiss()
            progress.cancel()
        }
    }
}