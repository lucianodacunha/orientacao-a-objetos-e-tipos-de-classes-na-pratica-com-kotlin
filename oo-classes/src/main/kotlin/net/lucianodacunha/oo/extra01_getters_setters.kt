package net.lucianodacunha.oo

fun main(){
    val animalJava = AnimalJava()

    animalJava.nome = "CachorroJ"
    animalJava.peso = 5.0

    println(animalJava.nome)

    val animalKotlin = AnimalKotlin()
    animalKotlin.nome = null
    animalKotlin.peso = 5.0
    println(animalKotlin.nome)
}

class AnimalKotlin(){
    var nome: String? = null
        set(value){
            println(value ?: "Nulo")
            field = value
        }
    var peso: Double? = null
}