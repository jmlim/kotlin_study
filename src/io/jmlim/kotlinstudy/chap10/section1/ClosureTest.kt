package io.jmlim.kotlinstudy.chap10.section1

fun main() {
    val calc = Calc()
    var result = 0 // 외부의 변수
    calc.addNum(2, 3) { x, y -> result = x + y } // 클로저
    println(result) // 값을 유지하여 5를 출력
}

class Calc {
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {
        add(a, b)
    }
}