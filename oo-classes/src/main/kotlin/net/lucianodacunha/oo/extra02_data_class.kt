package net.lucianodacunha.oo

/**
 * Uso de data class
 */

class Forma(val a: Int, val b: Int)

data class FormaData(val a: Int, val b: Int)

fun main(){
    val f1: Forma = Forma(10, 3)
    println(f1.toString())
    println(f1.hashCode())

    val f4: Forma = Forma(10, 3)
    println(f4.toString())
    println(f4.hashCode())

    val f2: FormaData = FormaData(10, 3)
    println(f2.toString())
    println(f2.hashCode())

    val f3: FormaData = FormaData(10, 3)
    println(f3.toString())
    println(f3.hashCode())

    val f5: FormaCustom = FormaCustom(10, 3)
    println(f5.toString())
    println(f5.hashCode())

    val f6 = f2.copy(4)
    println(f6.toString())
    println(f6.hashCode())
}

/**
 * Diferente de classes, os data classes são feitos para transporte de dados.
 * Desta forma, possuem implementações diferentes, voltadas para esse fim.
 * Assim, quando utilizamos métodos como toString e hashcode, seus resultados
 * serão diferentes.
 * Em classes, utilizando a implementação padrão, métodos toString e hashcode,
 * comportam-se de forma diferente.
 * Em Data Classes, mesmo utilizando a implementação padrão, esses métodos terão
 * os mesmos resultados caso os valores sejam os mesmos, mesmos em objetos
 * distintos.
 */

// Exemplo de implementação dos métodos toString e hashcode.
class FormaCustom(val a: Int, val b: Int) {
    override fun toString(): String {
        return "FormaCustom(a=${this.a}, b=${this.b})"
    }

    override fun hashCode(): Int {
        return 42 * a * b
    }
}
