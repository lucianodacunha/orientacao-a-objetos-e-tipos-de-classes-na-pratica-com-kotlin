package net.lucianodacunha
/**
 * Classes abstratas são utilizadas como templates para outras classes, já que
 * nunca serão instânciados
 *
 * Classes abstratas podem possuir métodos concretos.
 * Mas é uma classe concreta, caso um método.oo
 seja abstrato, a classe também será.
 */


abstract class Veiculo(){
    abstract fun acelerar()
}

class Carro: Veiculo() {
    override fun acelerar() {
        println("Implementação do sistema de aceleração de um carro")
    }
}

class Moto: Veiculo() {
    override fun acelerar() {
        println("Implementação do sistema de aceleração de uma moto")
    }
}

fun main(){
    val moto: Veiculo = Moto()
    val carro: Veiculo = Carro()

    moto.acelerar()
    carro.acelerar()
}