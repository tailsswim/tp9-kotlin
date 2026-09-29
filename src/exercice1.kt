import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextDouble()
    val num2 = scanner.nextDouble()

    val somme = num1 + num2
    val soustraction = num1 - num2
    val multiplication = num1 * num2

    println(somme)
    println(soustraction)
    println(multiplication)

    if (num2 == 0.0) {
        println("Erreur : division par zéro")
    } else {
        println(num1 / num2)
    }

    if (num1 > num2) {
        println("Le premier nombre est supérieur au second")
    }

    val sommeEntiere = somme.toInt()
    if (sommeEntiere % 2 == 0) {
        println("La somme est paire")
    } else {
        println("La somme est impaire")
    }
}
