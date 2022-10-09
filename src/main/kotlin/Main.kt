
fun main(args: Array<String>) {
    val listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")
    for (fruta in listaDeFrutas) println("Hoy voy a comer la fruta $fruta")
    listaDeFrutas.forEach{ fruta -> println("Hoy voy a comer la fruta nueva :  $fruta") }

    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    println(listaFiltrada)
}