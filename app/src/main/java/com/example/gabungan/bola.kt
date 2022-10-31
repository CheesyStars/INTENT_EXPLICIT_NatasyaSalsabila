package com.example.gabungan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class bola : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtjari: EditText
    private lateinit var btnbola: Button
    private lateinit var tvluasbola: TextView
    private lateinit var tvolumebola: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bola)

        edtjari = findViewById(R.id.edt_jari)
        btnbola = findViewById(R.id.btnCalculateBola)
        tvluasbola = findViewById(R.id.tv_luasbola)
        tvolumebola = findViewById(R.id.tv_volumebola)

        btnbola.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v?.id == R.id.btnCalculateBola) {
            val inputjari = edtjari.text.toString().trim()

            var kosong = false

            if (inputjari.isEmpty()) {
                kosong = true
                edtjari.error = "ga boleh kosong"
            }
            if (!kosong) {
                val luasbola = (4 * 3.14 * inputjari.toDouble())
                tvluasbola.text = "luas : " + luasbola.toString()

                val volumebola = (1.33 * 3.14 * inputjari.toDouble() * inputjari.toDouble() * inputjari.toDouble())
                tvolumebola.text = "volume : " + volumebola.toString()

            }
        }
    }
}