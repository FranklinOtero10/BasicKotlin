package com.example.basickotlin.Basic

class Variables {
    var age: Int = 20
    var altura: Double = 1.800
    var peso: Float = 80.5f
    var esMayor: Boolean = true
    var valorGrande: Long = 47856113135

    //Una vez inicializada la varibale no es necesario agregar el tipo
    var ejemplo = "Ejemplo no necesita especificar tipo ya que se define con inicializarlo"

    //Diferencia entre <var> y <val>
    var color = 457551 //Varibale modificable a lo largo del codigo
    val tamanio = 25497 //Cuando se quiere definir una constante no se va a modificar en el codigo

    //Variable Tipo String
    var nombre: String = "Juan Perez"
    //println(nombre) //Imprime en consola
//    nombre.length //Devuelve el tamaño de la cadena INT
//    nombre.isEmpty() // Devuelve si esta vacia TRUE/FALSE
//    nombre.contains("Juan") //Devuelve si contiene lo buscado TRUE/FALSE
//    nombre.substring(2,5) //Devuelve la cadena de x posicion a x posicion
//    nombre.replace("e", "o") //Remplaza el un caracter por otro

    //Concatenación
    var informacion: String = "Mi nombre es: $nombre y mi edad es: $age"

    /*devuelve una cadena formateada con los parámetros recibidos.
    Se le deben pasar los parámetros en el orden y con el tipo que se hayan definido en la cadena de formato
    */
    var StringFormat = String.format("Mi nombre es: %s y mi edad es: %d", nombre, age)

    /*  Algunos formatos para String format
        %b	Boolean
        %c	Char
        %d	Integer
        %e	Float en notación científica
        %f	Float y Double (Agrega %.nf para forzar n decimales)
        %o	Formato Octal
        %s	Strings
        %x	Formato Hexadecimal
     */
}