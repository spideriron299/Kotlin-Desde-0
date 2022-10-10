fun main(args: Array<String>) {
    imprimirNombre(nombre = "Diego", apellido = "Badillo", )
}

fun imprimirNombre(nombre: String,segundoNombre: String = "", apellido: String){
    println("Mi nombre es $nombre $segundoNombre y mi apellido es $apellido")
}