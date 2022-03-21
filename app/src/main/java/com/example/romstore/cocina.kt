package com.example.romstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class cocina: AppCompatActivity() {var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var departamento2 = ArrayList<Departamentos>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muebles)
        departamento2 = ArrayList()

        departamento2?.add(Departamentos("Puertas y frentes de cocina.", R.drawable.puertas, R.drawable.puertasf, "VEDDINGE",
            "La puerta VEDDINGE en blanco tiene una superficie lisa perfecta para crear una cocina moderna, luminosa y de líneas sencillas."))

        departamento2?.add(Departamentos("Gabinetes de cocina.", R.drawable.gabinetes, R.drawable.gabinetesco, "SEKTION",
            "Las bisagras que encajan por presión se montan sin tornillos y permiten desmontar fácilmente la puerta para limpiarla."))

        departamento2?.add(Departamentos("Cocinas.", R.drawable.cocinas, R.drawable.cocinass, "UTRUSTA",
            "Superficie de trabajo oculta que se puede sacar fácilmente cuando la necesites y volver a ocultar en cuanto termines de usarla."))

        departamento2?.add(Departamentos("Accesorios de interior SEKTION.", R.drawable.acces, R.drawable.access, "HÅLLBAR",
            "Los cubos HÅLLBAR están diseñados para satisfacer diferentes necesidades relacionadas con la clasificación de residuos. Esta combinación estrecha resulta ideal si dispones de un espacio limitado."))

        departamento2?.add(Departamentos("Barras de cocina.", R.drawable.barras, R.drawable.barrasc, "SKARARP",
            "Es muy higiénico ya que su superficie compacta y sin poros no conserva bacterias ni suciedad."))

        departamento2?.add(Departamentos("Electrodomésticos de cocina.", R.drawable.electro, R.drawable.electrod, "BRÄNNPUNKT",
            "No es necesario utilizar cerillas o un encendedor, porque el quemador se enciende si pulsas y giras el botón."))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, departamento2!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleDepartamentoDos::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }}}