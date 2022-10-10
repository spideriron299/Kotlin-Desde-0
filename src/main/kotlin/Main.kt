fun main(args: Array<String>) {
    val fraseAleatoria = "Me gusta mi gordita".randomCase()
    imprimirFrase(fraseAleatoria)
}
//Funcio normal
fun imprimirFrase(frase : String) : Unit {
    println("Tu frase es : $frase")
}
//FUNCION DE EXTENSION :D
fun String.randomCase() : String {
    val numeroAletorio = 0..99
    val resultadoAleatorio = numeroAletorio.random()
    return if (resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}