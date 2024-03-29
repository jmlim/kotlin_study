package io.jmlim.kotlinstudy.chap05.section4.innerref

// 이너 클래스에서 바깥 클래스 접근
open class Base {
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child : Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child Class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f() // 1. 현재 이너 클래스의 f() 접근
            Child().f() // 2. 바로 바깥 클래스 f()  접근
            super@Child.f() // 3. Child의 상위 클래스인 Base 클래스의 f() 접근
            println("[Inside] super@Child.x: ${super@Child.x}") // 4. Base의 x 접근
        }
    }
}

fun main() {
    val c1 = Child()
    // 이너 클래스의 Inside 메서드 test() 실행
    c1.Inside().test()
}