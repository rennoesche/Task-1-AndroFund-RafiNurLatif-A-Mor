package com.example.belajarkotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btnRegister: Button = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            val dfName= findViewById<EditText>(R.id.dfName).text.toString()
            val dfNewUsername = findViewById<EditText>(R.id.dfNewUsername).text.toString()
            val dataToSend =
                "Data Kamu:\n\nNama: $dfName\nUsername: $dfNewUsername"
            val intent = Intent(this, InformasiActivity::class.java)
            intent.putExtra("KEY_DATA", dataToSend)
            startActivity(intent)
        }
    }
}


