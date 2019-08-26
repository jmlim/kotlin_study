package io.jmlim.kotlinstudy.chap05.section3.override

// 상속 가능한 클래스를 위해 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    // 메서드
    fun fly() = println("Fly wing: $wing")

    // 오버라이딩 가능한 메서드
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

// 마지막 인자만 var 로 선언되어 프로퍼티가 추가 되었음을 알림.
class Parrot(name: String, wing: Int = 2, beak: String, color: String, var language: String = "natural") :
    Bird(name, wing, beak, color) {
    // Parrot 에 추가된 메소드
    fun speak() = println("Speak! $language")

    // 오버라이딩된 메서드
    override fun sing(vol: Int) {
        println("아이엠 페롯트~~~ $vol")
        speak()
    }
}

fun main() {
    val parrot = Parrot(name = "jmlim parrot", beak = "short", color = "multiple")
    parrot.language = "English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}")
    // 달라진 메서드 실행 가능
    parrot.sing(5)
}