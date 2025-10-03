package com.goyo.sekolahapps

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.Button



class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profil)

        val btnHome = findViewById<LinearLayout>(R.id.btnHome)
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnProfil = findViewById<LinearLayout>(R.id.btnProfile)
        btnProfil.setOnClickListener {
            Toast.makeText(this, "Profil", Toast.LENGTH_SHORT).show()
        }

        val btnKeluar = findViewById<Button>(R.id.btnKeluar)
        btnKeluar.setOnClickListener {
            finishAffinity()
            }


    }
}