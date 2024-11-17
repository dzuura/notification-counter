package com.dza.notificationcounter

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class NotifReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val msg = intent?.getStringExtra("TEST")
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        if (msg != null) {
            if (msg == "Like"){
                MainActivity.countLike++
                MainActivity.binding.counterLike.text=MainActivity.countLike.toString()
            }else if (msg == "Dislike"){
                MainActivity.countDislike++
                MainActivity.binding.counterDislike.text=MainActivity.countDislike.toString()
            }
        }
    }
}
