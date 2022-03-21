package com.example.romstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetalleDepartamentoCuatro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_departamento_cuatro)
        val index = intent.getStringExtra("ID")?.toInt()
        //Log.d("INDEX", index.toString())
        val contacto = index?.let { deco.departamento4?.get(it) }
        var imageView = findViewById<ImageView>(R.id.imageView)
        var tvNombre = findViewById<TextView>(R.id.tvNombre)
        var tvNombreC = findViewById<TextView>(R.id.tvNombreC)
        var tvDescripcion = findViewById<TextView>(R.id.tvDescripcion)


        imageView.setImageResource(contacto!!.imagenD)
        tvNombre.text= contacto?.nombre
        tvNombreC.text= contacto?.nombreo
        tvDescripcion.text= contacto?.descripcion
    }
}