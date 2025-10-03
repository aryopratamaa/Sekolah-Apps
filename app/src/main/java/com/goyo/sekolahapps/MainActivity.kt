package com.goyo.sekolahapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnHome = findViewById<LinearLayout>(R.id.btnHome)
        btnHome.setOnClickListener {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
        }

        val btnProfil = findViewById<LinearLayout>(R.id.btnProfile)
        btnProfil.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        val btnJurusan = findViewById<Button>(R.id.btnJurusan)
        btnJurusan.setOnClickListener {
            val intent = Intent(this, JurusanActivity::class.java)
            startActivity(intent)
        }


    }
}