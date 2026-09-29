class UtilisateurService {
    fun initialiser() {
        println("Service Utilisateur initialisé avec succès")
    }

    fun action() {
        println("Exécution d'une action utilisateur")
    }
}

class Application {
    lateinit var service: UtilisateurService

    fun initialiserApplication() {
        service = UtilisateurService()
        service.initialiser()
    }

    fun executer() {
        service.action()
    }
}

fun main() {
    val app = Application()
    app.initialiserApplication()
    app.executer()
}
