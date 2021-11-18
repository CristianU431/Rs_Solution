package com.example.rs_solution

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdaptadorPlatillos(private var lista: ArrayList<Platillo>, private var contexto: Context) : RecyclerView.Adapter<AdaptadorPlatillos.ViewHolder>()
{



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
       return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.lista_comida, parent, false), contexto)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        holder.bind(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }


    class ViewHolder(var vista: View, contexto: Context) :RecyclerView.ViewHolder(vista)
    {
        fun bind(platillo: Platillo)
        {

        }
    }

}