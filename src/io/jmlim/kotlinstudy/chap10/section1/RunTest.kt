package io.jmlim.kotlinstudy.chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("Kildong", "Kotlin")
    person.apply { this.skills = "Swift" }

    val returnObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success" // 사용되지 않음
    }

    println(person)
    println("$returnObj") // apply 는 객체를 반환

    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }

    println(person)
    println("returnObj2: $returnObj2") // run 은 마지막 표현식을 반환 (success)
}