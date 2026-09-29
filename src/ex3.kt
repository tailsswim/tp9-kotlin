class MonThread : Runnable {
    override fun run() {
        while (true) {
            println("Message toutes les secondes")
            Thread.sleep(1000)
        }
    }
}

fun main() {
    val thread1 = Thread(MonThread())
    val thread2 = Thread(MonThread())

    thread1.start()
    thread2.start()
}
