package com.example.basickotlin.Basic

class Ciclos {
    var numeros = 10
    var edad = 15

    fun cicloFor(){
        //Ciclo for
        for(i in 0..numeros){
            println("$i") // Imprime del 0 al 10
        }

        // until = variable -1
        for(i in 0 until numeros){
            println("$i") // Imprime del 0 al 9
        }

        // step incrementa en el valor indicado
        for(i in 0..numeros step 2){
            println("$i") // Imprime del 0 al 10 de 2 en 2
        }
    }

    fun cicloWhile(){
        while (edad >= 18){
            println("Su edad es $edad")
            edad++
        }
    }

    fun cicloDoWhile(){
        do {
            println("La edad es: $edad")
            edad++
        }while (edad >= 18)
    }
}