package com.example.romstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class ilu : AppCompatActivity() {var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var departamento5 = ArrayList<Departamentos>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alm)
        departamento5 = ArrayList()

        departamento5?.add(Departamentos("Lámparas.", R.drawable.lam, R.drawable.lam1, "TOKABO",
            "Es pequeña y por tanto, fácil de colocar en cualquier punto de la casa donde quieras tener luz de ambiente."))

        departamento5?.add(Departamentos("Iluminación decorativa.", R.drawable.decora, R.drawable.decora1, "LIVSÅR",
            "Gracias a que funciona con pilas, se puede colocar en cualquier lugar sin necesidad de enchufarse."))

        departamento5?.add(Departamentos("Iluminación integrada.", R.drawable.inte, R.drawable.inte1, "HALVKLART",
            "Como la luz LED desprende poco calor, puede usarse en espacios reducidos, como armarios, cajones y repisas."))

        departamento5?.add(Departamentos("Iluminación inteligente.", R.drawable.inteli, R.drawable.inteli1, "TRÅDFRI",
            "Como se enciende con el movimiento, tu casa será un lugar más seguro."))

        departamento5?.add(Departamentos("Iluminación de exterior.", R.drawable.exte, R.drawable.exte1, "SVARTRÅ",
            "Produce una bonita iluminación decorativa."))

        departamento5?.add(Departamentos("Bombillas LED.", R.drawable.led, R.drawable.led1, "RYET",
            "La luz LED consume hasta un 85% menos de energía y dura 10 veces más que las lámparas incandescentes tradicionales."))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, departamento5!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleDepartamentoCinco::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }}}