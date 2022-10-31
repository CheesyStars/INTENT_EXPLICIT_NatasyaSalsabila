package com.example.gabungan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class kubus : AppCompatActivity() , View.OnClickListener {
    private lateinit var edtsisi: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvluas: TextView
    private lateinit var tvolume: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kubus)
        edtsisi = findViewById(R.id.edt_sisi)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvluas = findViewById(R.id.tv_luas)
        tvolume = findViewById(R.id.tv_volume)

        btnCalculate.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v?.id == R.id.btnCalculate) {
            val inputsisi = edtsisi.text.toString().trim()

            var kosong = false

            if (inputsisi.isEmpty()) {
                kosong = true
                edtsisi.error = "ga boleh kosong"
            }
            if (!kosong) {
                val luas = inputsisi.toDouble() * inputsisi.toDouble() * inputsisi.toDouble()
                tvluas.text = "luas : " + luas.toString()

                val volume = 6 * inputsisi.toDouble() * inputsisi.toDouble()
                tvolume.text = "volume : " + volume.toString()

            }
        }
    }
}