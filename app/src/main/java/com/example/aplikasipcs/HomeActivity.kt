package com.example.aplikasipcs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mButtonHitung = findViewById<Button>(R.id.hitung)
        val mButtonHitung2 = findViewById<Button>(R.id.activity)

        mButtonHitung.setOnClickListener {
            val intentBiasa = Intent(this, MainActivity::class.java)
            startActivity(intentBiasa)
        }
        mButtonHitung2.setOnClickListener {
            val intentBiasa = Intent(this, kosong::class.java)
            startActivity(intentBiasa)
        }
    }
}