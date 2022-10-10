fun main(args: Array<String>) {
    //maps, son diccionarios de Kotlin o hash tables
    //Mapa inmutables, ni eliminar ni modificar
    val edadDeSuperheroes = mapOf(
        "ironman" to 35,
        "spiderman" to 25,
        "Capipaleta" to 99
    )
    println(edadDeSuperheroes)

    //Lista mutable
    var edadSuperHeroesMutable = mutableMapOf(
        "ironman" to 35,
        "spiderman" to 25,
        "Capipaleta" to 99
    )
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable.put("Wolverine",45)

    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable["Storm"] = 30
    println(edadSuperHeroesMutable)

    val edadIronman = edadSuperHeroesMutable["ironman"]
    println(edadIronman)

    edadSuperHeroesMutable.remove("Wolverine")
    println(edadSuperHeroesMutable)

    println(edadSuperHeroesMutable.keys)
    println(edadSuperHeroesMutable.values)
}