package net.lucianodacunha.oo

/**
 * Utilização de classe, herança e definição de um construtor.
 */
open class Tiger(val origin: String){
    fun sayHello(){
        println("A tiger from $origin says: grrrhh!")
    }
}

class SiberianTiger: Tiger(origin="Siberia")

fun main(){
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}
