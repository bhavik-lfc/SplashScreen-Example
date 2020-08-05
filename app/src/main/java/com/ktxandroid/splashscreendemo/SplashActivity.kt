package com.ktxandroid.splashscreendemo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    companion object {
        //Time for splash screen to display in milliseconds
        const val SPLASH_SCREEN_TIME_OUT = 3000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadData()
    }

    private fun loadData() {

        //This method can be replaced with network call where Activity is started on success

        Handler(Looper.getMainLooper()).postDelayed({

            //Start the next activity and finish current activity
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }, SPLASH_SCREEN_TIME_OUT)

    }
}
