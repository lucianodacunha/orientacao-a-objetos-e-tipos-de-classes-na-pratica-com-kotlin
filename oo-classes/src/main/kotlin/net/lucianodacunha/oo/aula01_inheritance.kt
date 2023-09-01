package net.lucianodacunha.oo

/**
 * Demonstrando a utilização de herança no Kotlin.
 *
 * A palavra reserva open, indica que a classe Dog poderá ser herdada.
 * No método, a palavra reserva indica que o método poderá ser sobrescrito.
 */
open class Dog {
    open fun sayHello(){
        println("wow wow!")
    }
}

class Pinscher : Dog(){
    override fun sayHello() {
        println("wif wif!")
    }
}

class Pitbull : Dog(){
    override fun sayHello() {
        println("wowowow wowowow!")
    }
}

fun main(){
    val dog1: Dog = Pinscher()
    dog1.sayHello()

    val dog2: Dog = Pitbull()
    dog2.sayHello()
}