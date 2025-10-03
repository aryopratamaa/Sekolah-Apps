package com.goyo.sekolahapps

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class JurusanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_jurusan)

        val recyclerView = findViewById<RecyclerView>(R.id.rvJurusan)

        val dataJurusan = listOf(
            ModelDataJurusan(
                "Rekayasa Perangkat Lunak (RPL)",
                "Jurusan RPL mempelajari tentang pemrograman, pengembangan perangkat lunak, basis data, serta pembuatan aplikasi berbasis desktop, web, maupun mobile.",
                R.drawable.ic_smkn1ap,
                "Laboratorium komputer, perangkat jaringan, proyektor pembelajaran, perangkat server, software pendukung coding (Android Studio, Visual Studio, dll).",
                "Programmer, Software Developer, Web Developer, Mobile App Developer, Game Developer, Database Administrator, System Analyst, IT Support.",
                "https://wa.me/6282161965317?text=Saya ingin bertanya seputar Program Keahlian RPL.",
                "https://instagram.com/smkn1airputih",
                "https://facebook.com/aryopratama04082000"
            ),
            ModelDataJurusan(
                "Teknik Komputer dan Jaringan (TKJ)",
                "Jurusan TKJ berfokus pada perakitan komputer, instalasi sistem operasi, manajemen jaringan, troubleshooting perangkat keras dan jaringan internet.",
                R.drawable.ic_smkn1ap,
                "Laboratorium komputer dan jaringan, router, switch, server, perangkat WiFi, kabel UTP, crimping tools, access point.",
                "Network Administrator, IT Support, Teknisi Komputer, Teknisi Jaringan, System Administrator, Teknisi Data Center, Teknisi ISP.",
                "https://wa.me/6282161965317?text=Saya ingin bertanya seputar Program Keahlian TKJ.",
                "https://instagram.com/smkn1airputih",
                "https://facebook.com/aryopratama04082000"
            ),
            ModelDataJurusan(
                "Teknik Kendaraan Ringan Otomotif (TKRO)",
                "Jurusan TKRO mempelajari tentang perawatan dan perbaikan mobil, sistem mesin, sistem kelistrikan, chasis, hingga sistem kontrol kendaraan.",
                R.drawable.ic_smkn1ap,
                "Bengkel praktik otomotif, mesin mobil, peralatan bengkel, alat ukur digital, sistem injeksi, peralatan service kelistrikan mobil.",
                "Mekanik Mobil, Teknisi Service, Konsultan Otomotif, Teknisi Kelistrikan Mobil, Mekanik Dealer Resmi, Wirausaha Bengkel Otomotif.",
                "https://wa.me/6282161965317?text=Saya ingin bertanya seputar Program Keahlian TKRO.",
                "https://instagram.com/smkn1airputih",
                "https://facebook.com/aryopratama04082000"
            ),
            ModelDataJurusan(
                "Teknik Bisnis Sepeda Motor (TBSM)",
                "Jurusan TBSM berfokus pada servis, perawatan, perbaikan, serta bisnis di bidang sepeda motor baik mesin, kelistrikan, maupun sistem injeksi.",
                R.drawable.ic_smkn1ap,
                "Bengkel sepeda motor praktik, motor injeksi, scanner motor, peralatan service motor, alat ukur digital, engine stand.",
                "Mekanik Sepeda Motor, Teknisi Dealer Resmi, Service Advisor, Teknisi Injeksi, Wirausaha Bengkel Motor, Sparepart Business.",
                "https://wa.me/6282161965317?text=Saya ingin bertanya seputar Program Keahlian TBSM.",
                "https://instagram.com/smkn1airputih",
                "https://facebook.com/aryopratama04082000"
            ),
            ModelDataJurusan(
                "Teknik Bodi Kendaraan Ringan (TBKR)",
                "Jurusan TBKR mempelajari perbaikan dan perawatan bodi kendaraan, pengecatan, perbaikan kerangka, serta teknik finishing.",
                R.drawable.ic_smkn1ap,
                "Bengkel praktik body repair, peralatan las, oven cat mobil, alat dempul, alat poles, alat ukur bodi kendaraan.",
                "Teknisi Body Repair, Teknisi Cat Mobil, Wirausaha Body Repair, Teknisi Dealer Resmi, Konsultan Finishing Otomotif.",
                "https://wa.me/6282161965317?text=Saya ingin bertanya seputar Program Keahlian TBKR.",
                "https://instagram.com/smkn1airputih",
                "https://facebook.com/aryopratama04082000"
            ),
            ModelDataJurusan(
                "Teknik Kimia Industri (TKI)",
                "Jurusan TKI mempelajari proses kimia industri seperti pengolahan bahan baku, proses produksi kimia, laboratorium kimia, serta teknologi lingkungan.",
                R.drawable.ic_smkn1ap,
                "Laboratorium kimia, peralatan analisis kimia, instrumen uji laboratorium, ruang praktik industri, peralatan keselamatan kerja (K3).",
                "Analis Kimia, Teknisi Laboratorium, Operator Industri Kimia, Quality Control, Teknisi Pengolahan Air, Wirausaha Produk Kimia.",
                "https://wa.me/6282161965317?text=Saya ingin bertanya seputar Program Keahlian TKI.",
                "https://instagram.com/smkn1airputih",
                "https://facebook.com/aryopratama04082000"
            )
        )


        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = JurusanAdapter(dataJurusan) { item ->
            val intent = Intent(this, DetailJurusanActivity::class.java)
            intent.putExtra("jurusan", item.jurusan)
            intent.putExtra("deskripsi", item.deskripsi)
            intent.putExtra("gambar", item.gambar)
            intent.putExtra("fasilitas", item.fasilitas)
            intent.putExtra("peluangkerja", item.peluangkerja)
            intent.putExtra("whatsapp", item.whatsapp)
            intent.putExtra("instagram", item.instagram)
            intent.putExtra("facebook", item.facebook)
            startActivity(intent)
        }
    }
}
