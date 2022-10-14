package com.example.basickotlin.Basic

open class Persona(var nombre: String, var edad: Int) {

    open fun mayorEdad(edad: Int): Int{
        if (edad >= 18){
            return edad
        }
        println("No es mayor")
        return edad
    }
}