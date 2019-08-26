package io.jmlim.kotlinstudy.chap07.section1

interface Nameable {
    var name: String
}

class StaffName : Nameable {
    override var name: String = "Sean"
}

// 쓰레드 실행을 위한 인터페이스
class Work : Runnable {
    override fun run() {
        println("work...")
    }
}

// 1. 각 매개변수에 해당 인터페이스를 위임
class Person(name: Nameable, work: Runnable) : Nameable by name, Runnable by work


fun main() {
    // 2. 생성자를 사용해 객체 바로 전달
    val person = Person(StaffName(), Work())
    println(person.name)
    person.run()
}