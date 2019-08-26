package io.jmlim.kotlinstudy.chap05.section2.default_property

class Bird(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {
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
    val coco = Bird(beak = "long", color = "red")
    
    println("coco.name: ${coco.name}, coco.wing: ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak: ${coco.beak}")
}