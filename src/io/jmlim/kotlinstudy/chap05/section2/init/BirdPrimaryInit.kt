package io.jmlim.kotlinstudy.chap05.section2.init

class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    // 1. 초기화 블록
    init {
        println("------------초기화 블록 -----------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("-----------초기화 블록 끝----------")
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    // 2.객체 생성과 함께 초기화 블록 수행
    val coco = Bird("jmlim bird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
}