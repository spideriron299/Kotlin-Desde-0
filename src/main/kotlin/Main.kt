
fun main(args: Array<String>) {
    var nombre : String? = null
    nombre?.let {
        valor -> println("El nombre no es nulo es $valor")
    }
    nombre = "Diego"
    nombre?.let {
            valor -> println("El nombre no es nulo es $valor")
    }
}