package io.jmlim.kotlinstudy.chap07.section3

// 호출 연산자
class Manager {
    operator fun invoke(value: String) {
        println(value)
    }
}

data class PointJm(val x: Int, val y: Int)

operator fun PointJm.unaryMinus() = PointJm(-x, -y)

fun main() {
    val manager = Manager()
    manager("Do something for me!") //manager.invoke("..") 형태로 호출되며 invoke 가 생략됨.

    // 또 다른 예
    val sum = { x: Int, y: Int -> x + y }
    println(sum.invoke(3, 10))
    println(sum(3, 10))

    val point = PointJm(10, 20)
    println(-point)
}