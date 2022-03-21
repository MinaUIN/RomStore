package com.example.romstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class deco : AppCompatActivity() {var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var departamento4 = ArrayList<Departamentos>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alm)
        departamento4 = ArrayList()

        departamento4?.add(Departamentos("Marcos e imágenes.", R.drawable.dep4, R.drawable.dep41, "RIBBA",
            "El paspartú resalta el cuadro y facilita el enmarcado."))

        departamento4?.add(Departamentos("Plantas y flores.", R.drawable.dep42, R.drawable.dep422, "FEJKA",
            "Una planta artificial que luce natural durante muchos años."))

        departamento4?.add(Departamentos("Espejos.", R.drawable.dep43, R.drawable.dep433, "SVANSELE",
            "Se puede colgar horizontal o verticalmente."))

        departamento4?.add(Departamentos("Floreros y jarrones.", R.drawable.dep44, R.drawable.dep444, "FALLENHET",
            "El jarrón también puede hacer las veces de macetero o de recipiente para guardar utensilios de cocina y otros objetos. Da un toque de estilo rústico a la decoración."))

        departamento4?.add(Departamentos("Accesorios decorativos.", R.drawable.dep45, R.drawable.dep455, "BOMARKEN",
            "Te permite exponer tus objetos de colección preferidos. Se puede colocar encima de una superficie plana o fijarse a la pared."))

        departamento4?.add(Departamentos("Relojes.", R.drawable.dep46, R.drawable.dep466, "SKÄRIG",
            "Gracias al mecanismo de cuarzo, el reloj funciona con precisión."))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, departamento4!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleDepartamentoCuatro::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }}}