
fun main(args: Array<String>) {
    val largoDelValorInicial = superfuncion(valorInicial = "Hola") {valor ->
        valor.length
    }

    println(largoDelValorInicial)

    val lambda: () -> String = funcionInception("Diego")
    val valorLambda: String = lambda()
    println(valorLambda)
}
fun superfuncion(valorInicial : String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

fun funcionInception(nombre : String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}