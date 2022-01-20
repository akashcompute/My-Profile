package com.example.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        try {
            Handler().postDelayed(
                {
                    val startAct = Intent(
                        this@SplashActivity,
                        MainActivity::class.java
                    )
                    startActivity(startAct)
                    this.finish()
                },
                2000
            )
        } catch (e: Exception) {
            Toast.makeText(this@SplashActivity ,
                "Something Went Wrong" ,
                Toast.LENGTH_SHORT)
                .show()
            this.finish()
            e.printStackTrace()
        }
    }
}
