package com.example.basickotlin.Basic

class Condiciones {

    var edad = 18
    var diaSemana = 0

    // IF ELSE Multiples condiciones
    fun cond() {
        //En las condiciones tambien se pueden utilizar rangos
        // Ej edad in 18..35
        if (edad >= 18 && edad <= 35) {
            println("Usted es joven")
        } else if (edad >= 35 && edad <= 60) {
            println("Usted es adulto")
        } else if (edad > 0 && edad < 18) {
            println("Es menor de edad")
        } else {
            println("Escriba una edad válida")
        }
    }

    fun diasSemana() {
        //Uso de When para cuando hay muchas condiciones
        /*if (diaSemana == 1){
            println("Hoy es lunes")
        }else if (diaSemana == 2){
            println("Hoy es martes")
        }else if (diaSemana == 3){
            println("Hoy es miercoles")
        }else if (diaSemana == 4){
            println("Hoy es jueves")
        }else if (diaSemana == 5){
            println("Hoy es viernes")
        }else if (diaSemana == 6){
            println("Hoy es sabado")
        }else if (diaSemana == 7){
            println("Hoy es domingo")
        }else{
            println("No es un dia valido")
        }*/
        //Las multiples condiciones se pueden remplazar por when
        when (diaSemana) {
            1 -> println("Hoy es lunes")
            2 -> println("Hoy es martes")
            3 -> println("Hoy es miercoles")
            4 -> println("Hoy es jueves")
            5 -> println("Hoy es viernes")
            6 -> println("Hoy es sabado")
            7 -> println("Hoy es domingo")
            else -> println("No es un dia valido")
        }
    }
}