package io.jmlim.kotlinstudy.chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1 // 접근허용
    }

    fun access() {
        privateFunc() // 접근허용
    }
}

class OtherClass {
    // val opc = PrivateClass() // 불가 - 프로퍼티 opc는 private 이 되어야함
    private val opc = PrivateClass() // 가능 - 프로퍼티 opc가 private 이므로

    fun test() {
        val pc = PrivateClass() // 생성가능
    }
}

fun main() {
    val pc = PrivateClass() // 생성가능
    // pc.i // 접근불가
    //  pc.privateFunc(); // 접근불가
}

fun TopFunction() {
    val tpc = PrivateClass() // 객체 생성 가능
}