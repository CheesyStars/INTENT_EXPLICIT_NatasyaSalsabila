package com.example.gabungan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class addnumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addnumber)

        var tvCounter : TextView = findViewById(R.id.tvCounter)
        var btnAdd : Button = findViewById(R.id.btnAddNumber)

        tvCounter.text = "0"

        btnAdd.setOnClickListener {
            val currVal = tvCounter.text.toString().toInt()
            val nextVal = currVal + 1
            tvCounter.text = nextVal.toString()

            if (nextVal >= 33) {
                tvCounter.text = "0"
            }
        }
    }
}