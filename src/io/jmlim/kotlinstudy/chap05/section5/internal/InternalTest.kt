package io.jmlim.kotlinstudy.chap05.section5.internal

internal class InternalClass {
    internal var i = 1
    internal fun icFunc() {
        i += 1 // 접근허용
    }
    fun access() {
        icFunc() // 접근허용
    }
}

class Other {
    // 프로퍼티를 지정할 때 internal 로 맞춰야함
    internal val ic = InternalClass()
    fun test() {
        ic.i // 접근허용
        ic.icFunc() // 접근허용
    }
}

fun main() {
    val mic = InternalClass()
    mic.i // 접근허용
    mic.icFunc() // 접근허용
}