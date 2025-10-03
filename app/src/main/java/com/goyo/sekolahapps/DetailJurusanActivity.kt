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

        val img = findViewById<ImageView>(R.id.detailImage)
        val title = findViewById<TextView>(R.id.detailTitle)
        val desc = findViewById<TextView>(R.id.detailDesc)
        val facility = findViewById<TextView>(R.id.detailFacility)
        val career = findViewById<TextView>(R.id.detailCareer)

        val programTitle = intent.getStringExtra("title")
        val programDesc = intent.getStringExtra("desc")
        val imageRes = intent.getIntExtra("imageRes", 0)
        val programFacility = intent.getStringExtra("facility")
        val programCareer = intent.getStringExtra("career")

        title.text = programTitle
        desc.text = programDesc
        facility.text = "Fasilitas: ${programFacility ?: "-"}"
        career.text = "Peluang Kerja: ${programCareer ?: "-"}"

        if (imageRes != 0) {
            img.setImageResource(imageRes)
        } else {
            img.setImageResource(R.drawable.ic_smkn1ap)
        }

    }
}