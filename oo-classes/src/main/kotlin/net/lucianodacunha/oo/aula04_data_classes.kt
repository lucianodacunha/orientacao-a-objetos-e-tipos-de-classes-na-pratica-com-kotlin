package net.lucianodacunha.oo

/**
 * Classes projetadas para o armazenamento de valores
 * implementando várias funções para essas aplicações.
 * Nas data classes, métodos como toString, equals, etc, já são implementados
 * de forma mais prática.
 *
 * Uteis para casos de transporte de dados e precisamos de acesso a métodos
 * boilerplate, com suas implementações padrõa.
 */
data class User(val name: String, val id: Int){
    // Sobrescrita, definindo que somente o id será utilizado.
    override fun equals(other: Any?) = other is User && other.id == this.id
}

fun main(){
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // será igual ao second user, pois utilizam propriedade com os mesmos valores.
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    println(user.copy())
    // compara a referência, ou seja, false.
    println(user === user.copy())

    // copia o objeto, alterando o parâmetro sobrescrito.
    println(user.copy("Max"))
    println(user.copy(id = 3))

    // Propriedades podem ser acessadas através do método componentX
    println("name = ${user.component1()}")
    println("name = ${user.component2()}")
}