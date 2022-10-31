package com.example.gabungan

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class biodata : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        var sayHello : TextView = findViewById(R.id.tv_halo)
        var editName : EditText = findViewById(R.id.edt_name)
        var editNim : EditText = findViewById(R.id.edt_nim)
        var editProdi : EditText = findViewById(R.id.edt_prodi)
        var btnHello : Button = findViewById(R.id.btn_halo)

        //variabel ini berada di lokal


        btnHello.setOnClickListener {
            val namo = editName.text.toString()
            val nimm = editNim.text.toString()
            val prodii = editProdi.text.toString()

            sayHello.text = "Haii $namo identitas kamu nim nya $nimm dari prodi $prodii"
            //apa yang di input konvert dulu ke string selanjutnya tamplikan di sayhello
        }
    }
}