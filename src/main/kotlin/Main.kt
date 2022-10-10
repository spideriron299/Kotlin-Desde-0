fun main(args: Array<String>) {
    //Sets, no pueden tener elementos repetidos. No tienen un orden en especifico
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocalesRepetidas)

    val numerosFavortios = mutableSetOf(1,2,3,4)
    println(numerosFavortios)
    numerosFavortios.add(5)
    println(numerosFavortios)

    //Se elimina el elemento dependiendo del valor, no de la poscision
    numerosFavortios.remove(5)
    println(numerosFavortios)

    val valorDelSet = numerosFavortios.firstOrNull { numero -> numero > 2 }
    println(valorDelSet)
}