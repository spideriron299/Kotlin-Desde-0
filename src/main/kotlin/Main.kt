
fun main(args: Array<String>) {
    val nombre = "Fer"

    if (nombre.isNotEmpty()) println("El  largo de nuestra variable nombre es ${nombre.length}") else println("Error la variable esta vacia")

    val mensaje : String = if (nombre.length > 4 ) {
        "Tu nombre es largo!"
    } else if (nombre.isEmpty()) {
        "Nombre esta vacio"
    }  else {
        "Tienes un nombre corto"
    }
    println(mensaje)

}