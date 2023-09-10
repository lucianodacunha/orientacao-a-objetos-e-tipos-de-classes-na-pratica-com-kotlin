package net.lucianodacunha.oo

open class Eletronico(var marca: String){
    fun ligar(){}
    fun desligar(){}
}

class Computador(marca: String) : Eletronico(marca){
    fun instalarSoftware(){}
    fun processar(){}
}

fun main(){
    val comp = Computador("New")
    with(comp) {
        ligar()
        desligar()
        instalarSoftware()
        processar()
    }
}