package io.jmlim.kotlinstudy.chap08.projection

class Box<T>(var item: T)

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int) : Animal(50)

fun <T> printObj1(box: Box<out Animal>) {
    val obj: Animal = box.item
    // box.item = Animal()   // 오류! 설정 하려고 할때는 in 이 지정되어야 함.
    println(obj)
}

fun main() {
    val animal: Box<Animal> = Box(Animal(10));
    val cat: Box<Cat> = Box(Cat(11));
//????
    //  printObj1(animal)
    //  printObj1(cat)

}