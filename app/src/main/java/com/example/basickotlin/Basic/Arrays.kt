package com.example.basickotlin.Basic

class Arrays {
    val intArray = intArrayOf(5, 7, 10, 56, 78)
    //Modificar un array
    // intArray[2] = 15
    val booleanArray = booleanArrayOf(true, false, false, true)

    // Para acceder a una posicion en especifico
    // intArray[5]

    val doubleArray = DoubleArray(3){50.0}

    //Recorriendo arrays
    fun arrayStrings(){
        val playList = arrayOf("Toy Story", "Titanic", "Top Gun")

        for (pelicula in playList) println(pelicula)
    }
}