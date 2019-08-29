package io.jmlim.kotlinstudy.chap08.section1

class Calc<T : Number> {
    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main() {
    val calc = Calc<Int>()
    println(calc.plus(10, 20))

    val calc2 = Calc<Double>()
    println(calc2.plus(1.2, 4.4))

    val calc3 = Calc<Long>()
    println(calc3.plus(10L, 20L))
}