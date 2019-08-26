package io.jmlim.kotlinstudy.chap05.section1.define

// 1. 클래스의 정의
class Bird {
    // 2. 프로퍼티 (속성)
    var name: String = "method"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    // 3. 메서드 (함수)
    fun fly() = println("Fly wing: $wing")

    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    // 4. 클래스의 생성자를 통한 객체의 생성
    val coco = Bird()
    // 5. 객체의 프로퍼티에 값 할당
    coco.color = "blue"

    // 6. 객체의 멤버 프로퍼티 읽기
    println("colo.color: ${coco.color}")
    // 7. 객체의 멤버 메서드 사용
    coco.fly()
    coco.sing(3)
}