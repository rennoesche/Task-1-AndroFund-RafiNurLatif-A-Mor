package com.example.belajarkotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val dfUsername = findViewById<EditText>(R.id.dfUsername).text.toString()
            val dataYangDikirim = "Data Kamu:\n\nUsername: $dfUsername"
            val intent = Intent(this, InformasiActivity::class.java)
            intent.putExtra("KEY_DATA", dataYangDikirim)
            startActivity(intent)
        }
    }
}

