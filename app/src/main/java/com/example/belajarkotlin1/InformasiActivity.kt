package com.example.belajarkotlin1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InformasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi)

        val informasiTextView = findViewById<TextView>(R.id.informasiTextView)
        val receivedData = intent.getStringExtra("KEY_DATA")

        if (receivedData != null) {
            informasiTextView.text = receivedData
        } else {
            informasiTextView.text = "Data tidak ditemukan"
        }


    }
}

