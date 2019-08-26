package io.jmlim.kotlinstudy.chap05.section2.secondary

class Bird {
    // 1. 프로퍼티 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 2. 부 생성자 - 매개변수를 통해 초기화할 프로퍼티를 저장
    constructor(name: String, wing: Int, beak: String, color: String) {
        // 3. this.name 은 선언된 현재 클래스의 프로퍼티를 나타냄
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    // 두번째 부 생성자
    constructor(name: String, beak: String) {
        // 3. this.name 은 선언된 현재 클래스의 프로퍼티를 나타냄
        this.name = name
        this.wing = 2
        this.beak = beak
        this.color = "gray"
    }

    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    // 4. 생성자의 인자로 객체 생성과 동시에 초기화
    val coco = Bird("mybird", 2, "short", "blue")
    val coco2 = Bird("mybird2", "long")

    coco.color = "yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}