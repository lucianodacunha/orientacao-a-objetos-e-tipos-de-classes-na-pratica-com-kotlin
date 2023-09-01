package net.lucianodacunha.oo

/**
 * A ideia das sealed classes, é criar uma restrição de extensão de um classe,
 * apenas ao pacotes ao qual a classe está inserida.
 */

sealed class Mammal(val name: String)

class Cat(val catName: String): Mammal(catName)
class Human(val humanName: String, val job: String = "Developer"): Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when(mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main(){
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Luciano")))
}