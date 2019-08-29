package io.jmlim.kotlinstudy.chap08.section1

import java.lang.IllegalStateException

// reified 를 이용한 결정되지 않은 제네릭 자료형의 처리
fun main() {
    val result = getType<Float>(10)
    println("result = $result")
}

inline fun <reified T> getType(value: Int): T {
    println(T::class)
    println(T::class.java)

    return when (T::class) {
        Float::class -> value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported!")
    }
}