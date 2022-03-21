package com.example.romstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class elec : AppCompatActivity(){var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var departamento6 = ArrayList<Departamentos>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alm)
        departamento6 = ArrayList()

        departamento6?.add(Departamentos("Electrodomésticos de cocina.", R.drawable.dep60, R.drawable.dep61, "KONSISTENS",
            "Los distintos niveles de cocción y las rejillas regulables permiten hornear y guisar más fácilmente platos deliciosos."))

        departamento6?.add(Departamentos("Iluminación inteligente.", R.drawable.inteli, R.drawable.inteli1, "TRÅDFRI",
            "Como se enciende con el movimiento, tu casa será un lugar más seguro."))

        departamento6?.add(Departamentos("Cables y cargadores.", R.drawable.dep64, R.drawable.dep65, "NORDMÄRKE",
            "Ya no perderás el tiempo buscando el cargador o desenredando los cables."))

        departamento6?.add(Departamentos("Accesorios para celulares y tablets.", R.drawable.dep66, R.drawable.dep67, "ISBERGET",
            "La superficie está inclinada para que puedas sentarte y tener la pantalla a la altura de los ojos."))

        departamento6?.add(Departamentos("Bocinas", R.drawable.dep68, R.drawable.dep69, "SYMFONISK / SYMFONISK",
            "Cuelga el altavoz en la pared. Ahorrarás espacio y será un bonito adorno."))

        departamento6?.add(Departamentos("Purificadores de aire y filtros.", R.drawable.dep70, R.drawable.dep71, "FÖRNUFTIG",
            "El purificador de aire se vende con un filtro de partículas para purificar el aire eliminando distintos contaminantes lo más eficazmente posible. También puedes comprar un filtro de carbón activo y combinar los dos."))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, departamento6!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleDepartamentoSeis::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }}}