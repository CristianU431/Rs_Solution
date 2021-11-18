package com.example.rs_solution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun generarDatosPrueba() : ArrayList<Platillo>
    {
        val lista = ArrayList<Platillo>()
        lista.add(Platillo(R.drawable.sandwich, "Sandwich", "Queso gouda, mozarella, cheddar, blue cheese, pickles, papas al hilo, mayo-sauco kétchup, lechuga, tomate.(200 gramos), 3 salsas: ají papacho´s, kétchup y mayonesa de la casa","Un plato delicioso de cocinar rápidamente", "S/.25.00", 4.5))
        lista.add(Platillo(R.drawable.salchirico, "Salchipapas", "Papas fritas , salchicha frankfurter y salsas. Salsas:Mayonesa, kétchup, mostaza, ají papahos, sauco kétchup, rocoto, blue cheese (4 salsas a elegir )", "Plato delicioso para consumir entre muchas personas o grupos de amigos", "S/.10.00", 5.0))
        lista.add(Platillo(R.drawable.pollito, "Pollo a la brasa", "1/4 de pollo atómico, 250 grs. papas fritas, 80 grs. salchicha frankfurter, 60 grs. de chorizo parrillero y 1 huevo.","Plato calidad - precio para degustar dejándote con el estóamgo lleno acompañado de su geseosa", "S/.50.00", 4.5))
        lista.add(Platillo(R.drawable.pollitos, "Trio Pollero", "Las alitas bamba (5-6), muslitos broster(3) y alitas charapitas(5-6), 4 salsas: blue cheese, rocoto carretilla, salsa tártara, kétchup de sauco y mostaza.","Plato de pollo con distintos sabores para degustar como aperitivo esencial entre parejas", "S/.25.00", 4.5))
        return lista
    }
}