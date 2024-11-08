package com.example.adaptertp2

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.adaptertp2.adapter.Myadapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val languages = listOf(
            hashMapOf("nom" to "Java", "annee" to "1995", "image" to R.drawable.ic_java),
            hashMapOf("nom" to "C#", "annee" to "2000", "image" to R.drawable.ic_csharp),
            hashMapOf("nom" to "Python", "annee" to "1991", "image" to R.drawable.ic_python),
            hashMapOf("nom" to "Kotlin", "annee" to "2011", "image" to R.drawable.ic__kotlin)
        )
        val listView = findViewById<ListView>(R.id.lv)

        val adapter = Myadapter(this, languages)
        listView.adapter = adapter
    }
}