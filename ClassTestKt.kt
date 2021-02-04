package ClassTest

class Car{
    val wheel: Int = 4
    fun start(){
        println("Engine Start!")
    }
}

class Bird

fun main() {
    val sonata = Car()
    println(sonata.wheel)
    sonata.start()
}
