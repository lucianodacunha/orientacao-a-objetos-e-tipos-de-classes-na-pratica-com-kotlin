package net.lucianodacunha.oo

/**
 * Toda classe em Kotlin, por padrão será sempre final
 * Por isso, precisamos indicar a possibilidade de extensão com a palavra
 * open.
 */
open class Lion (val name: String, val origin: String){
    fun sayHello(){
        println("$name, the lion from $origin says: graoh!")
    }
}

/**
 * No construtor, não colocamos o tipos, pois indicamos que o valores deverão
 * ser propagados para a classe superior.
 */
class Asiatic(name: String) : Lion (name = name, origin = "India")

fun main(){
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}