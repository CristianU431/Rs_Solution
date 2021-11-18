package com.example.rs_solution

import java.io.Serializable

data class Platillo
    (
    var idImage: Int,
    var titulo: String,
    var ingredientes: String,
    var descripcion: String,
    var precio: String,
    var clasificacion: Double
    ) : Serializable
