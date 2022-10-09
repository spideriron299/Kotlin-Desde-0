fun main(args: Array<String>) {
    val numerosDeLoteria = listOf(11,22,43,56,78,66)

    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosDeLoteriaDesendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDesendientes)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa =  numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNUmeros = numerosDeLoteria.map{ numero -> "Tu numero de loteria es $numero" }

    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)
    println(mensajesDeNUmeros)
}