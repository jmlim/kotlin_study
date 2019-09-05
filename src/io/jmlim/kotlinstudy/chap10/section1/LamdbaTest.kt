package io.jmlim.kotlinstudy.chap10.section1


/**
 * 람다식과 고차 함수 복습
 *
 * 람다식 : 항상 중괄호로 묶여 있으며
 * 중괄호 안에 매개변수는 화살표 왼쪽에 배치되고 오른쪽에는 그에 따른 식을 구성합니다.
 */
val isPositive: (Int) -> Boolean = {
    val isPositive = it > 0
    isPositive // 마지막 표현식이 반환됨
}

val isPositiveLabel: (Int) -> Boolean = number@{
    val isPositive = it > 0
    return@number isPositive // 라벨을 사용해 반환됨
}

/**
 * 고차함수 : 고차함수는 함수의 매개변수로 함수를 받거나 함수 자체를 반환할 수 있음
 */
fun inc(x: Int): Int {
    return x + 1
}

fun high(name: String, body: (Int) -> Int): Int {
    println("name : $name")
    val x = 0
    return body(x)
}