import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val note1 = scanner.nextDouble()
    val note2 = scanner.nextDouble()
    val note3 = scanner.nextDouble()

    val moyenne = (note1 + note2 + note3) / 3.0
    println(moyenne)

    if (moyenne >= 50.0) {
        println("Réussi")
    } else {
        println("Échoué")
    }

    if (moyenne >= 80.0) {
        println("Réussi avec mention excellente")
    } else if (moyenne >= 50.0) {
        println("Réussi")
    } else {
        println("Échoué")
    }
}
