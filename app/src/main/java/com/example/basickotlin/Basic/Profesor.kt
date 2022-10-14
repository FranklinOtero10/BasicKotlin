package com.example.basickotlin.Basic

class Profesor(nombre: String, edad: Int): Persona(nombre, edad) {
    private var salario: Int
    private var materiaImpartida: String

    init {
        salario = 0
        materiaImpartida = ""
    }

    override fun mayorEdad(edad: Int): Int {
        println("Bienvenido...")
        return edad
    }
}