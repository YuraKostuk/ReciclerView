package com.example.reciclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.card_item.view.*


class AdapterChar : RecyclerView.Adapter<AdapterChar.CharHolder>() {

    val listFoto = ArrayList<Foto>()

    class CharHolder(itemF: View) : RecyclerView.ViewHolder(itemF) {

        val name = itemF.name
        val image = itemF.image

        fun getItemF(itemF: Foto) {
            name.text = itemF.name
            image.setImageResource(itemF.imageId)
        }

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CharHolder {
        val itemInf = LayoutInflater.from(p0.context).inflate(R.layout.card_item, p0, false)
        return CharHolder(itemInf)
    }

    override fun onBindViewHolder(p0: CharHolder, p1: Int) {
        p0.getItemF(listFoto[p1])
    }

    override fun getItemCount(): Int {
        return listFoto.size
    }

    fun addList(foto:Foto){
        listFoto.add(foto)
        notifyDataSetChanged()
    }

}