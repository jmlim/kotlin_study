package io.jmlim.kotlinstudy.chap05.section4.prisecon

// 2. 주 생성자
class Person(firstname: String, out: Unit = println("[Primary Constructor] Parameter")) {

    val fName = println("[Property] Person fName: $firstname") // 3. 프로퍼티 할당

    init {
        // 4. 초기화 블록
        println("[init] Person init block")
    }

    // 1. 부 생성자
    constructor(
        firstname: String,
        age: Int,
        out: Unit = println("[Secondary Constructor] Parameter")
    ) : this(firstname) {
        // 5 부 생성자 본문
        println("[Secondary Constructor] Body: $firstname, $age")
    }
}

fun main() {
    val p1 = Person("kildong", 30) // 1 -> 2 호출, 3->4->5  실행
    println()
    val p2 = Person("Dooly") // 2 호출, 3 -> 4 실행
}