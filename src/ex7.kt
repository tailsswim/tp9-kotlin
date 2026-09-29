class DatabaseConnection {
    fun verifierEtat(): Boolean {
        return true
    }

    fun executerOperation() {
        println("Opération de base de données exécutée")
    }
}

class DatabaseManager {
    lateinit var connexion: DatabaseConnection

    fun initialiserConnexion() {
        connexion = DatabaseConnection()
    }

    fun gerer() {
        if (connexion.verifierEtat()) {
            connexion.executerOperation()
        }
    }
}

fun main() {
    val manager = DatabaseManager()
    manager.initialiserConnexion()
    manager.gerer()
}
