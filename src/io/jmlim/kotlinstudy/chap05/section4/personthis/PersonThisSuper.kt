package io.jmlim.kotlinstudy.chap05.section4.personthis

open class Person {
    constructor(firstname: String) {
        println("[Person] firstname: $firstname")
    }

    constructor(firstname: String, age: Int) { // 3
        println("[Person] firstname: $firstname, $age")
    }
}

class Developer : Person {
    constructor(firstname: String) : this(firstname, 10) { // 1
        println("[Developer] $firstname")
    }

    constructor(firstname: String, age: Int) : super(firstname, age) { // 2
        println("[Developer] $firstname, $age")
    }
}

fun main() {
    val sean = Developer("Sean")
}

