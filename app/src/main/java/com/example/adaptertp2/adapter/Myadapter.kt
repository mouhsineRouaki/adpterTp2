package com.example.adaptertp2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.adaptertp2.R

class Myadapter(val c:Context, val list: List<java.util.HashMap<String, out Any>>): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = p1?:LayoutInflater.from(c).inflate(R.layout.list_view_propriete, p2, false)

        val image = view.findViewById<ImageView>(R.id.languageIcon)
        val nom= view.findViewById<TextView>(R.id.languageNom)
        val annee= view.findViewById<TextView>(R.id.languageAnnee)

        val language = getItem(p0) as HashMap<String, String>

        val icon = language["image"] as Int
        nom.text = language["nom"].toString()
        annee.text = language["annee"].toString()
        image.setImageResource(icon)

        return view
    }

}