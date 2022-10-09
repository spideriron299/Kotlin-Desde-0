fun main(args: Array<String>) {
    //Lista inmutable, no se pueden cambiar los valores
    val listasDeNombres = listOf("Juan", "Enrique", "Camila")
    println(listasDeNombres)

    //Lista mutable, si se pueden cambiar los valores
    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOPerador = listaVacia[0]
    println(valorUsandoOPerador)

    val primerValor: String? = listasDeNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Diego")
    println(listaVacia)
    listaVacia.removeIf { caracteres -> caracteres.length > 3 }
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4)
    println("Nuestro array $myArray")
    println("Array como lista ${myArray.toList()}")
    //Los arrays son cuando se manejan miles de datos, si no usa listas.
}