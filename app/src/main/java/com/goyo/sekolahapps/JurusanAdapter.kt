package com.goyo.sekolahapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JurusanAdapter(
    private val itemJurusan: List<ModelDataJurusan>,
    private val onClick: (ModelDataJurusan) -> Unit
    ) : RecyclerView.Adapter<JurusanAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgJurusan: ImageView = view.findViewById(R.id.itemImage)
        val tvJurusan: TextView = view.findViewById(R.id.itemTitle)
        val tvDeskripsi: TextView = view.findViewById(R.id.itemDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_jurusan, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemJurusan[position]
        holder.imgJurusan.setImageResource(item.gambar)
        holder.tvJurusan.text = item.jurusan
        holder.tvDeskripsi.text = item.deskripsi

        holder.itemView.setOnClickListener { onClick(item) }
    }

    override fun getItemCount(): Int = itemJurusan.size
}
