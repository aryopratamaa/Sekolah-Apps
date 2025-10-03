package com.goyo.sekolahapps

import android.os.Bundle
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

        // Tampilkan gambar (pakai default kalau kosong)
        if (gambar != 0) {
            tampilGambar.setImageResource(gambar)
        } else {
            tampilGambar.setImageResource(R.drawable.ic_smkn1ap)
        }
    }
}
