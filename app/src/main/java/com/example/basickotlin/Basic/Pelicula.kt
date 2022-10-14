package com.example.ejkot.KT

class Pelicula(var name: String, var duration: Int, var trailer: Trailer? = null, var available: Boolean) {

    /*propiedades y funciones están vinculadas a una clase pero no a la instancia de esa clase,
    básicamente como la palabra clave "estática" en Java*/
    companion object{
        const val SEGUNDOS = 60 //Constante estatica

        fun totalCuadros(): Int {
            return 60 * SEGUNDOS
        }
    }

    //Para llamar un metodo estatico
    //   Clase.NombreMetodo(Parametros si son requeridos)
    //Pelicula.totalCuadros()


    fun play(): Boolean {
        return true
    }

    fun playTrailer(){
        trailer?.playTrailer(name) //Al agregar ? todoo lo que esta a la derecha ya no lo ejecuta
    }

    fun pause(){
        println("En pausa...")
    }
}


class Trailer(){
/*    fun EjemploNullPointer(){
        var a: Int = 5
        //var b: Int     //No se puede imprimir una varibale sin antes incializarla
        //var b: Int = null     //No permite agregar valor null
        var b: Int? = null     //Para agregar el valor null se agrega <?>

        println(a+b!!) //Para decir que el valor b no es null se agregan <!!>
    }*/

    fun playTrailer(nombrePelicula: String){
        println("$nombrePelicula")
    }
}