object Question03 extends App {

    val names = List ("Benny", "Niroshan", "Saman", "Kumara")

    val toUpper: String => String = _.toUpperCase()
    val toLower: String => String = _.toLowerCase()

    // def formatNames(name: String, func: String => String): String = {
    //     func(name)
    // }
    val formatNames: (String, String => String) => String = (name, func) => func(name)

    println(formatNames(names(0), toUpper))
    print(formatNames(names(1), toUpper).substring(0, 2) + formatNames(names(1).substring(2, 8), toLower) + "\n")
    println(formatNames(names(2), toLower))
    print(names(3).substring(0, 5) + formatNames(names(3).substring(5, 6), toUpper))

}
