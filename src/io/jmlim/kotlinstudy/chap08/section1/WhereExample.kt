package io.jmlim.kotlinstudy.chap08.section1

interface InterfaceA
interface InterfaceB

class HandlerA : InterfaceA, InterfaceB
class HandlerB : InterfaceA

class ClassA<T> where T : InterfaceA, T : InterfaceB

/**
 * myMax의 인자 amb 에 들어갈 자료형을 숫자형과 비교형만으로 한정하고 있음.
 */
fun <T> myMax(a: T, b: T): T where T : Number, T : Comparable<T> {
    return if (a > b) a else b
}

fun main() {
    val obj1 = ClassA<HandlerA>() // 객체 생성 가능
//    val obj2 = ClassA<HandlerB>() // 범위에 없으므로 오류 발생!
}