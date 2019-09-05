package io.jmlim.kotlinstudy.chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("Kildong", "Kotlin")
    person.apply { this.skills = "Swift" }

    println(person)

    val returnObj = person.apply {
        name = "Sean" // this 는 생략할 수 있음,
        skills = "Java" // this 없이 객체의 멤버에 여러번 접근
    }
    println(person)
    println(returnObj)
}