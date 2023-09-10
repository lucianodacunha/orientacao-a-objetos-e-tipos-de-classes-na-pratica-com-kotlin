package net.lucianodacunha.oo.anonimas

interface Chave { // 1
    fun abrir()
}

class Porta(val numero: String) { // 2

    fun abrir(c : Chave) {
        c.abrir()
    }
}

fun main() { // 3
    val porta = Porta("001")
    porta.abrir(object : Chave { // 4
        override fun abrir() {
            println("Abrindo a porta ...")
        }
    })
}