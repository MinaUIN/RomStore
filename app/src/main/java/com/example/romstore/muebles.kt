package com.example.romstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class muebles : AppCompatActivity() {var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var departamento1 = ArrayList<Departamentos>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muebles)
        departamento1 = ArrayList()

            departamento1?.add(Departamentos("Escritorios de altura regulable.", R.drawable.escritorioalt, R.drawable.escritorioaltr, "IDÅSEN",
            "Es fácil regular la altura entre 63 y 127 cm para poder trabajar cómodamente sentado o de pie. Debajo del tablero hay una red para organizar los cables que te ayuda a tener el escritorio ordenado y despejado."))

                    departamento1?.add(Departamentos("Escritorios para el hogar.", R.drawable.escritoriohog, R.drawable.escritorioho, "MALM",
            "El modulo extraíble te proporciona otra superficie de trabajo. Puedes recoger los cables y extensiones en la repisa que hay debajo del tablero para tenerlos ocultos pero a la mano."))

                    departamento1?.add(Departamentos("Escritorios para oficina.", R.drawable.escritorioofi, R.drawable.escritoriof, "BEKANT",
            "Debajo del tablero hay una red para organizar los cables que te ayuda a tener el escritorio ordenado y despejado."))

                    departamento1?.add(Departamentos("Escritorios para niños.", R.drawable.escritorionin, R.drawable.escritorioni, "FLISAT",
            "El escritorio se puede inclinar para que los niños puedan cambiar la postura de estudio. La ranura evita que los lápices y otros objetos pequeños se caigan cuando el escritorio está inclinado."))

                    departamento1?.add(Departamentos("Escritorios para juegos.", R.drawable.escritoriojue, R.drawable.escritorioju, "UPPSPEL",
            "La altura del bastidor eléctrico se puede ajustar de 72 a 120 cm, por lo que siempre puede sentarse o estar de pie a una altura cómoda."))

                    departamento1?.add(Departamentos("Mesas para laptop.", R.drawable.mesalap, R.drawable.mesala, "BJÖRKÅSEN",
            "Una solución flexible y versátil que se puede utilizar en todo el hogar y para muchas actividades diferentes."))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, departamento1!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleDepartamentoUno::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
    }}}