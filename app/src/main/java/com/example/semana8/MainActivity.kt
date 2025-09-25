package com.example.semana8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnServices = findViewById<Button>(R.id.btnServices)
        val btnAbout = findViewById<Button>(R.id.btnAbout)

        btnServices.setOnClickListener {
            startActivity(Intent(this, ServicesActivity::class.java))
        }

        btnAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}