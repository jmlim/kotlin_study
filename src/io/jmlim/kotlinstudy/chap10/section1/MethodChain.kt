package io.jmlim.kotlinstudy.chap10.section1

fun main() {
    var a = 1
    var b = 2

    a = a.let { it + 2 }.let {
        val i = it + b
        i
    }

    println(a)
}