package com.goyo.sekolahapps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailJurusanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_jurusan)

        // Ambil view dari layout
        val tampilGambar = findViewById<ImageView>(R.id.detailGambar)
        val tampilJurusan = findViewById<TextView>(R.id.detailJurusan)
        val tampilDeskripsi = findViewById<TextView>(R.id.detailDeskripsi)
        val tampilFasilitas = findViewById<TextView>(R.id.detailFasilitas)
        val tampilPeluangKerja = findViewById<TextView>(R.id.detailPeluangkerja)

        // Ambil data yang dikirim dari Intent
        val jurusan = intent.getStringExtra("jurusan")
        val deskripsi = intent.getStringExtra("deskripsi")
        val gambar = intent.getIntExtra("gambar", 0)
        val fasilitas = intent.getStringExtra("fasilitas")
        val peluangKerja = intent.getStringExtra("peluangkerja")

        // Tampilkan data ke tampilan
        tampilJurusan.text = jurusan
        tampilDeskripsi.text = deskripsi
        tampilFasilitas.text = "Fasilitas: ${fasilitas ?: "-"}"
        tampilPeluangKerja.text = "Peluang Kerja: ${peluangKerja ?: "-"}"
        tampilGambar.setImageResource(gambar)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        val btnInstagram = findViewById<ImageView>(R.id.btnInstagram)
        val instagram = intent.getStringExtra("instagram")
        btnInstagram.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(instagram))
            startActivity(intent)
        }

        val btnWhatsapp = findViewById<ImageView>(R.id.btnWhatsapp)
        val whatsapp = intent.getStringExtra("whatsapp")
        btnWhatsapp.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(whatsapp))
            startActivity(intent)
        }

        val btnFacebook = findViewById<ImageView>(R.id.btnFacebook)
        val facebook = intent.getStringExtra("facebook")
        btnFacebook.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebook))
            startActivity(intent)
        }
    }
}