package com.example.basickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtN1: EditText = findViewById(R.id.edtNum1)
        val edtN2: EditText = findViewById(R.id.edtNum2)
        val edtRes: TextView = findViewById(R.id.txtRespuesta)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener(View.OnClickListener {
            val res = edtN1.text.toString().toFloat() + edtN2.text.toString().toFloat()
            edtRes.text = "Respuesta: $res"
        })
    }
}