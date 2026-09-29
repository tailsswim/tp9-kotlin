class Configuration {
    init {
        println("Chargement d'une configuration complexe en cours")
    }
}

class App {
    val config: Configuration by lazy {
        Configuration()
    }
}

fun main() {
    val application = App()
    println("Application démarrée")
    val maConfig = application.config
    println("Configuration chargée et prête")
}
