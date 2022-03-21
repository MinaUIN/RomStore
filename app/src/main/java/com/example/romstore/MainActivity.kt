package com.example.romstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtNombre = findViewById<EditText>(R.id.editTextTextPersonName)
        val txtPass = findViewById<EditText>(R.id.editTextTextPassword)

        val btnIngresar = findViewById<Button>(R.id.button)

        btnIngresar.setOnClickListener{
            val nUsuario = txtNombre.getText().toString()
            val pass:String = txtPass.getText().toString()
            if (nUsuario.equals("Romina1") && pass.equals("rom123")){
                var intent = Intent(this, ListaDepartamentos::class.java)
                startActivity(intent)
                Toast.makeText(this, "Bienvenido a RomStore", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}