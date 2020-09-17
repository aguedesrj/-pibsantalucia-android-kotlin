package br.com.pibsantalucia.repository

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class CXFirebaseMessagingService: FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
//        Log.d("br.com.pibsantalucia", "******** onMessageReceived")
//        var myIntent = Intent("push")
//        myIntent.putExtra("pesCodigoPush", remoteMessage?.data?.get("pesCodigo"))
//
//        Log.d("br.com.pibsantalucia", "******** &&&&&&&& onMessageReceived"+remoteMessage?.data?.get("pesCodigo"))
//        Log.e("br.com.pibsantalucia", "******** &&&&&&&& onMessageReceived")
//
//        handleMessage(remoteMessage)
//        super.sendBroadcast(myIntent)
    }
}