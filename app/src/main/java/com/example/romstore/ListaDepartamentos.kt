package com.example.romstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class ListaDepartamentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_departamentos)
        var destinos: ArrayList<Lista> = ArrayList()
        destinos.add(Lista("Muebles", R.drawable.muebles))
        destinos.add(Lista("Cocina y electrodomésticos", R.drawable.cocina))
        destinos.add(Lista("Almacenamiento y organización", R.drawable.alm))
        destinos.add(Lista("Decoración", R.drawable.deco))
        destinos.add(Lista("Iluminación", R.drawable.ilu))
        destinos.add(Lista("Electrónicos para el hogar", R.drawable.elec))


        val listaDestino = findViewById<ListView>(R.id.listaDestino)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador = AdaptadorCustom(this, destinos)

        listaDestino.adapter = adaptador
        listaDestino.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                if (position == 0) {
                    startActivity(Intent(this, muebles::class.java))
                } else if (position == 1) {
                    startActivity(Intent(this, cocina::class.java))
                }else if(position==2){
                    startActivity(Intent(this, alm::class.java))
                }else if(position==3){
                    startActivity(Intent(this, deco::class.java))
                }else if(position==4){
                    startActivity(Intent(this, ilu::class.java))
                }else{
                    startActivity(Intent(this, elec::class.java))
                }

            }
    }
}