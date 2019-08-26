package io.jmlim.kotlinstudy.chap07.section1

open class Animal(val name: String)

// 1. feeding의 구현을 위해 인터페이스 Pet 저장
class Dog(name: String, override var category: String) : Animal(name), Pet {
    override var species: String = "개"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}


class Master {
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("아롱이", "Small")
    val cat = Cat("애용이", "BigFat")

    master.playWithPet(dog)
    master.playWithPet(cat)
}