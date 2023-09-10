package net.lucianodacunha.oo

import io.github.serpro69.kfaker.Faker

/**
 * Classe Quarto, representando uma hospedagem.
 * Possui um membro estático que acumula o total de hospedagens.
 */
class Quarto(val cliente: String){
    // código executado quando a classe é criada.
    // utilizado para fazer verificações de valores, verificações e lógica.
    // podemos definir vários init em uma mesma classe.
    // executado após o construtor.
    init {
        Quarto.totalDeHospedes++
    }

    companion object {
        var totalDeHospedes = 0
    }
}

fun main(){
    val q100 = Quarto(Faker().name.name())
    val q101 = Quarto(Faker().name.name())
    val q102 = Quarto(Faker().name.name())

    println("Quantidade de hospedes: ${Quarto.totalDeHospedes}")
}
/**
 * - Companion object está para o static do Java
 * - Só pode existir um na classe
 * - pode ser nomeado
 * - podem ser variáveis e funções
 * - similar ao object
 * - o object pode existir mais que um
 * - object é obrigatório o nome
 * - entre um object e outro o escopo é distinto
 * - [companion] object serão inicializados somente no primeiro acesso
 */