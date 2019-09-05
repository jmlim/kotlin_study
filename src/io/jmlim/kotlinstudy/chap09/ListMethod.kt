package io.jmlim.kotlinstudy.chap09

fun main() {
    var names: List<String> = listOf("one", "two", "three")

    println(names.size)
    println(names.get(0))
    println(names.indexOf("three"))
    println(names.contains("two"))
}