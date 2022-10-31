package com.example.gabungan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_kalkulator)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivity2: Button = findViewById(R.id.btn_tasbih)
        btnMoveActivity2.setOnClickListener(this)

        val btnMoveActivity3: Button = findViewById(R.id.btn_biodata)
        btnMoveActivity3.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_kalkulator -> {
                val moveIntent = Intent(this@MainActivity, kalkulator::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_tasbih -> {
                val moveIntent2 = Intent(this@MainActivity, addnumber::class.java)
                startActivity(moveIntent2)
            }
            R.id.btn_biodata -> {
                val moveIntent3 = Intent(this@MainActivity, biodata::class.java)
                startActivity(moveIntent3)
            }
        }
    }
}