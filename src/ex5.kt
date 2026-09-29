fun calculCouteux(): Int {
    Thread.sleep(2000)
    return 42
}

fun main() {
    val resultat: Int by lazy {
        calculCouteux()
    }

    println("Avant utilisation")
    println(resultat)
}
