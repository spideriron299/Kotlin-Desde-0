//Con with accedes directamente a las propiedades de la variable
fun main(args: Array<String>) {
    val colores = listOf("azul","amarillo","Rojo")
    with(colores){
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores $size")
    }
}