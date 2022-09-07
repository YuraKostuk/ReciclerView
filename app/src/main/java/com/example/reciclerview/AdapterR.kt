package com.example.reciclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.card_item.view.*

class AdapterR : RecyclerView.Adapter<AdapterR.FotoHolder>() {

    val fotoList = ArrayList<Foto>()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): FotoHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.card_item, p0, false)
        return FotoHolder(view)
    }

    override fun onBindViewHolder(p0: FotoHolder, p1: Int) {
        p0.getIdCard(fotoList[p1])
    }

    override fun getItemCount(): Int {
        return fotoList.size
    }

    class FotoHolder(itemFoto: View) : RecyclerView.ViewHolder(itemFoto) {
        val image = itemFoto.image
        val name = itemFoto.name

        fun getIdCard(obektFoto: Foto) {
            name.text = obektFoto.name
            image.setImageResource(obektFoto.imageId)

        }

    }

    fun addFoto(foto: Foto) {
        fotoList.add(foto)
        notifyDataSetChanged()
    }

}