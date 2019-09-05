package io.jmlim.kotlinstudy.chap09

fun main() {
    val stringList: ArrayList<String> = arrayListOf<String>("Kildong", "Hello", "Kotlin")
    stringList.add("Java")
    stringList.remove("Hello")
    println(stringList)
}