package com.example.gabungan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.PI

class kerucut : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtr: EditText
    private lateinit var edts: EditText
    private lateinit var edtt: EditText
    private lateinit var btnkerucut: Button
    private lateinit var tvluas: TextView
    private lateinit var tvluas2: TextView
    private lateinit var tvolumek: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kerucut)

        edtr = findViewById(R.id.edt_r)
        edts = findViewById(R.id.edt_s)
        edtt = findViewById(R.id.edt_t)
        btnkerucut = findViewById(R.id.btnCalculateKerucut)
        tvluas = findViewById(R.id.tv_luasSkerucut)
        tvluas2 = findViewById(R.id.tv_luasPkerucut)
        tvolumek = findViewById(R.id.tv_volumekerucut)

        btnkerucut.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v?.id == R.id.btnCalculateKerucut) {
            val inputr = edtr.text.toString().trim()
            val inputs = edts.text.toString().trim()
            val inputt = edtt.text.toString().trim()

            var kosong = false

            if (inputr.isEmpty()) {
                kosong = true
                edtr.error = "ga boleh kosong"
            }
            if (inputs.isEmpty()) {
                kosong = true
                edts.error = "ga boleh kosong"
            }
            if (inputt.isEmpty()) {
                kosong = true
                edtt.error = "ga boleh kosong"
            }
            if (!kosong) {
                val luasS = PI * inputr.toDouble() * inputs.toDouble()
                tvluas.text = "Luas Selimut : " + luasS.toString()

                val luasP = luasS + (PI * inputr.toDouble() * inputr.toDouble() )
                tvluas2.text = "Luas Permukaan : " + luasP.toString()

                val volumek = 0.3 * PI * inputr.toDouble() * inputr.toDouble() * inputt.toDouble()
                tvolumek.text = "Volume : " + volumek.toString()

            }
        }
    }
}