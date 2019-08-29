package io.jmlim.kotlinstudy.chap08.section1.limit

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int) : Animal(50)
class Spider(val position: Boolean) : Animal(1)

// 1. 형식 매개변수를 Animal 로 제한
class Box<out T : Animal>(val element: T) {  // 주 생성자에서는 val 만 허용
    fun getAnimal(): T = element // 2. out은 반환 자료형에서만 사용할 수 있음
    //fun set(new: T) { 3. 오류! T는 in 위치에 사용할 수 없음
    //   element = new
    // }
}

// 만약 아웃을 사용하는 경우 형식 매개변수를 갖는 프로퍼티는 var 로 지정될 수 없고 val 만 허용.
// var 를 사용하려면 private 으로 지정해야함.
class BoxVar<out T : Animal>(private var element: T)


/**
 * 클래스에 직접 지정하는 방법 (선언 지점 변성의 한 예)
 */
class BoxIn<in T : Animal>(val size: Int)

// 사용지점 변성과 자료형 프로젝션

class AnimalHome<T> (var item: T)
fun <T> printObj(box: AnimalHome<out Animal>) {
    val obj: Animal = box.item // item 의 값을 얻음
    println(obj)
}

fun main() {
    // 일반적인 객체 선언
    val c1: Cat = Cat(10);
    val s1: Spider = Spider(true)

    var a1: Animal = c1 // 클래스의 상위 자료형이므로 변환하는 것은 아무런 문제 없음
    a1 = s1 // 4. a1은 Spider 의 객체가 됨
    println("a1.size = ${a1.size}")

    val c2: Box<Animal> = Box<Cat>(Cat(10)) // 5. 공변성 - Cat은 Animal 의 하위 자료형
    println("c2.element.size = ${c2.element.size}")

    //  val c3: Box<Cat> = Box<Animal>(10) // 6. 오류! 반대의 경우는 인스턴스와되지 않음
    // val c4: Box<Any> = Box<Int>(10) // 7. 오류! 자료형을 제한하여 Animal 과 하위 클래스 이외에는 사용할 수 없음.

    val c5: BoxIn<Cat> = BoxIn<Animal>(10) // 반대로지정됨(하위 자료형인 c5: BoxIn<Cat 이 상위 자료형인 BoxIn<Animal>로 할당할 수 있게 됨.
}