package com.goyo.sekolahapps

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.Toast
import android.net.Uri
import android.widget.ImageView
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

        val btnInstagram = findViewById<ImageView>(R.id.btnInstagram)
        btnInstagram.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/aryopratamaa"))
            startActivity(intent)
        }

        val icWhatsapp = findViewById<ImageView>(R.id.btnWhatsapp)
        icWhatsapp.setOnClickListener {
            val noHp = "6282161965317"
            val pesan = "Halo, saya ingin menanyakan tentang aplikasi SekolahApps."
            val url = "https://wa.me/$noHp?text=${Uri.encode(pesan)}"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val icFacebook = findViewById<ImageView>(R.id.btnFacebook)
        icFacebook.setOnClickListener {
            val uri = Uri.parse("https://www.facebook.com/aryopratama04082000")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.facebook.katana")
            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, uri))
            }
        }


    }
}