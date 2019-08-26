package io.jmlim.kotlinstudy.chap07.section1

interface Pet {
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티

    val msgTags: String
        get() = "I'm your lovely pet!"

    // 종을 위한 프로퍼티
    var species: String

    fun feeding() // 마찬가지로 추상메서드
    // 일반 메서드: 구현부를 포함하면 일반적인 메서드로 기본이 됨
    fun patting() {
        println("Keep patting!") // 구현부
    }
}

//
class Cat(name: String, override var category: String) : Pet {
    override var species: String = "고양이"
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("이애희","small")
    println("Pet Category: ${obj.category}")
    println("Pet Message Tags: ${obj.msgTags}")
    obj.feeding() // 구현된 메서드
    obj.patting() // 기본메서드
}