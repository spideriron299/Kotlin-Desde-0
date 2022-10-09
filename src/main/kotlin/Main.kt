
fun main(args: Array<String>) {
    val nombreColor = "Carmesi"

    when (nombreColor) {
        "Amarillo" -> println("EL amarillo es el color de los grillos")
        "Rojo", "Carmesi" -> println("El color es de spiderman")
        else -> println("Error. No tengo informacion del color ")
    }

    val code = 405
    when(code){
        in 200..299 -> println("Todo ah ido bien")
        in 400..500 -> println("ALgo ah fallado")
        else -> println("Codigo desconocido, algo ah fallado.")
    }

    val tallaDeZapatos = 41
    val mensaje = when(tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no nos quedan!"
        45 -> "Lo siento no tenemos disponible"
        else -> "Estos zapatos solo vienen en tallas 41-45"
    }
    println(mensaje)
}