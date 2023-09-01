package net.lucianodacunha.oo

/**
 * Pode ser aplicada no contexto onde buscamos obter uma instância única.
 */

import java.util.Random

class LuchDispatcher {
    fun getNumber(){
        var objRandom = Random()
        println(objRandom.nextInt())
    }
}

fun main(){
    val d1 = LuchDispatcher()
    val d2 = LuchDispatcher()

    d1.getNumber()
    d2.getNumber()

    // main2()
    // main3()
    // main4()
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivityDays: Int = 30 * festivityDays
        var specialDays: Int = 30 * specialDays
    }

    val total = dayRates.standard + dayRates.festivityDays + dayRates.specialDays
    print("Total price: $$total")
}

fun main2(){
    rentPrice(10, 2, 1)
}

// Object declaration
object DoAuth {
    fun takeParams(username: String, password: String){
        println("input Auth parameters = $username:$password")
    }
}

fun main3(){
    DoAuth.takeParams("foo", "qwerty")
}


// Companion Objets
class BigBen {
    companion object Bonger {
        fun getBonges(nTimes: Int){
            for (i in 1..nTimes){
                print("BONG")
            }
        }
    }
}

fun main4(){
    BigBen.getBonges(12)
}