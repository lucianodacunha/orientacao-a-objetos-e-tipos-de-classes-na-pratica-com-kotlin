package net.lucianodacunha.oo.interfaces

interface Abastecivel{ // 1
    fun abastecer(quantidade: Int)
}

abstract class Veiculo // 2

class Carro : Veiculo(), Abastecivel{ // 3
    var tanque: Int? = null //4

    override fun abastecer(quantidade: Int) { //5
        this.tanque = this.tanque?.plus(quantidade) // 6
    }
}

class Posto(){ // 7
    fun abastecer(abastecivel: Abastecivel, quantidade: Int){ // 8
        println("Abastecendo um abastecível...")
        abastecivel.abastecer(quantidade)
    }
}

class Estacionamento(){ // 9
    fun estacionar(veiculo: Veiculo){
        println("Estacionando um veículo...")
    }
}

fun main(){ // 10
    val carro = Carro()

    val posto = Posto()
    val estacionamento = Estacionamento()
    posto.abastecer(carro, 50)
    estacionamento.estacionar(carro)

    println("Carro é um carro? ${carro is Carro}") // 11
    println("Carro é um abastecível? ${carro is Abastecivel}") // 12
}

class Galao: Abastecivel { // 13

    var capacidade: Int? = null
    override fun abastecer(quantidade: Int) {
        this.capacidade = this.capacidade?.plus(quantidade)
    }
}