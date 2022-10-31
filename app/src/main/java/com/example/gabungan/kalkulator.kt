package com.example.gabungan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class kalkulator : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        val btnMoveActivity: Button = findViewById(R.id.btn_kubus)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivity2: Button = findViewById(R.id.btn_kerucut)
        btnMoveActivity2.setOnClickListener(this)

        val btnMoveActivity3: Button = findViewById(R.id.btn_bola)
        btnMoveActivity3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_kubus -> {
                val moveIntent = Intent(this@kalkulator, kubus::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_kerucut -> {
                val moveIntent2 = Intent(this@kalkulator, kerucut::class.java)
                startActivity(moveIntent2)
            }
            R.id.btn_bola -> {
                val moveIntent3 = Intent(this@kalkulator, bola::class.java)
                startActivity(moveIntent3)
            }
        }
    }
}
