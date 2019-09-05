package io.jmlim.kotlinstudy.chap09

fun main() {
    // 불변형 List 의 사용
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")

    for(name in names) {
        println(name)
    }

    for(num in numbers) println(num) // 한 줄에서 처리하기
    println() // 내용이 없을 때는 한 줄 내리는 개행
}