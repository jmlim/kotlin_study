package io.jmlim.kotlinstudy.chap10.section1

fun filterdNames(length: Int) {
    val names = arrayListOf("Kim", "Hong", "Go", "Hwang","Jeon")
    val filterResult = names.filter {
        it.length == length // 바깥의 length 에 접근
    }
    println(filterResult)
}

fun main() {
    filterdNames(4)
}