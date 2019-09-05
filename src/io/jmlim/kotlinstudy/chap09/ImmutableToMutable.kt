package io.jmlim.kotlinstudy.chap09

fun main() {
    val names: List<String> = listOf("one", "two", "three") // 불변형 List 초기화
    val mutableNames = names.toMutableList() // 새로운 가변형 List 가 만들어짐
    mutableNames.add("four") // 가변형 List 에 하나의 요소 추가
    println(mutableNames)
}