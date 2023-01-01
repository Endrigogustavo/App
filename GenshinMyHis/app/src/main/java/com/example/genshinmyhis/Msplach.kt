package com.example.genshinmyhis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Msplach : AppCompatActivity() {

    private val msplach : Long = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_msplach)

        Handler().postDelayed({

            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }, msplach)

    }
}