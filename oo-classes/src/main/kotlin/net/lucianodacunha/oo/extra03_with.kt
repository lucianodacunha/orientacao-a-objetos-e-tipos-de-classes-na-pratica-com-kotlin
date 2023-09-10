package net.lucianodacunha.oo

fun main(){
    val nt = Notebook(1000.0f, 15.5f)

    with(nt) {
        ligar()
        desligar()
    }
}

class Notebook(val preco: Float, polegadas: Float){
    fun ligar(){
        println("Ligando o Notebook...")
    }

    fun desligar(){
        println("...Notebook desligado.")
    }
}

