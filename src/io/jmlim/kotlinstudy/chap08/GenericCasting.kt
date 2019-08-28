package io.jmlim.kotlinstudy.chap08

/**
 * 제네릭 클래스의 자료형 변환하기.
 */

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
    val obj1: Parent = Child()
    //  val obj2: Child = Parent() // 오류 : 자료형 불일치

    //val obj3: Cup<Parent> = Cup<Child>() // 오류! 자료형 불일치
    //val obj4: Cup<Child> = Cup<Parent>() // 오류! 자료형 불일치

    val obj5 = Cup<Child>() // obj5는 Cup<Child> 의 자료형이됨
    val obj6: Cup<Child> = obj5 // 자료형이 일치하므로 OK!
}