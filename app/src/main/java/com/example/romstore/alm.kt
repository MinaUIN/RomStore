package com.example.romstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class alm : AppCompatActivity() {var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var departamento3 = ArrayList<Departamentos>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alm)
        departamento3 = ArrayList()

        departamento3?.add(Departamentos("Estantes y libreros.", R.drawable.dep3, R.drawable.dep33, "KALLAX",
            "Expón tus objetos favoritos en los estantes abiertos o añade accesorios para crear una solución personalizada con almacenaje cerrado."))

        departamento3?.add(Departamentos("Sistemas de solución de almacenamiento.", R.drawable.dep31, R.drawable.dep311, "PAX",
            "Las patas regulables permiten corregir las irregularidades del suelo."))

        departamento3?.add(Departamentos("Cómodas y cajoneras.", R.drawable.dep32, R.drawable.dep313, "IDÅSEN",
            "Puedes personalizar el almacenamiento poniéndole imanes en la parte exterior."))

        departamento3?.add(Departamentos("Almacenamiento para cosas pequeñas y organizadores.", R.drawable.dep333, R.drawable.dep314, "KUGGIS",
            "Ideal para guardar manualidades, accesorios de juegos y otros objetos voluminosos."))

        departamento3?.add(Departamentos("Zapateros, soportes y percheros.", R.drawable.dep34, R.drawable.dep315, "GREJIG",
            "Tan práctico en la entrada como en el mueble. Y como es plegable, puedes comprar alguno más y guardarlos para cuando hagan falta."))

        departamento3?.add(Departamentos("Bolsas.", R.drawable.dep35, R.drawable.dep316, "DRÖMSÄCK",
            "El tejido es de poliéster reciclado. Transformar los residuos en recursos nos permite avanzar hacia un futuro más sustentable."))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, departamento3!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleDepartamentoTres::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }}}