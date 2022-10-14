package com.example.basickotlin.Basic

class Metodos {
    //Ventajas de Kotlin se pueden inicializar las varibles en los argumentos de la funcion
    // void = Unit > Unit significa vacio
    fun mensaje(){
        println("Mensaje desde un método")
    }

    fun suma(n1: Double, n2: Double){
        println(n1+n2)
    }

    //Funcion que retorna algun valor
    fun multiplicacion(n1: Double, n2: Double): Double{
        return n1*n2
    }

    //Sobrecargando la funcion
    fun multiplicacion(n1: Double): Double{
        return n1*10
    }
}