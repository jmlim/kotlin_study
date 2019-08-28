package io.jmlim.kotlinstudy.chap08

// 무변성 선언
class Box<T>(val size: Int)

// 공변성 선언
class Box2<out T>(val size: Int)

// 반 공변성 선언
class Box3<in T>(val size: Int)

fun main() {
    //  val anys: Box<Any> = Box<Int>(10) //오류! 자료형 불일치
    //val nothings: Box<Nothing> = Box<Int>(20) // 오류! 자료형 불일치

    val anys2: Box2<Any> = Box2<Int>(10) // 관계 성립으로 객체 생성 가능
    // val nothings2: Box2<Nothing> = Box2<Int>(20) // 오류! 자료형 불일치 (Nothing 은 Int의 하위 자료형이 아니므로 오류가 남)

    // val anys3: Box3<Any> = Box3<Int>(10) // 오류! 자료형 불일치
    val nothings3: Box3<Nothing> = Box3<Int>(20) // 관계 성립으로 객체 생성 가능
}

