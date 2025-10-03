package com.goyo.sekolahapps

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class DetailJurusanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_jurusan)

        val tampilGambar = findViewById<ImageView>(R.id.detailGambar)
        val tampilJurusan = findViewById<TextView>(R.id.detailJurusan)
        val tampilDeskripsi = findViewById<TextView>(R.id.detailDeskripsi)
        val tampilFasilitas = findViewById<TextView>(R.id.detailFasilitas)
        val tampilPeluangkerja = findViewById<TextView>(R.id.detailPeluangkerja)

        val jurusan = intent.getStringExtra("jurusan")
        val deskripsi = intent.getStringExtra("deskripsi")
        val gambar = intent.getIntExtra("gambar", 0)
        val fasilitas = intent.getStringExtra("fasilitas")
        val peluangkerja = intent.getStringExtra("peluangkerja")

        tampilJurusan.text = jurusan
        tampilDeskripsi.text = deskripsi
        tampilFasilitas.text = "Fasilitas: ${fasilitas ?: "-"}"
        tampilPeluangkerja.text = "Peluang Kerja: ${peluangkerja ?: "-"}"

        if (gambar != 0) {
            tampilGambar.setImageResource(gambar)
        } else {
            tampilGambar.setImageResource(R.drawable.ic_smkn1ap)
        }

    }
}