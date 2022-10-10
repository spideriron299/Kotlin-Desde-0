
fun main(args: Array<String>) {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi A3").apply {
        removeIf{ movil -> movil.contains("Google") }
    }
    println(moviles)

    val colores : MutableList<String>? = mutableListOf("Amarillo", "Rojo", "Azul")
    colores?.apply {
        println("Nuestros colores son $this")
        println("Cantidad de coloes es $size")
    }

}