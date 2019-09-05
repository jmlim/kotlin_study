package io.jmlim.kotlinstudy.chap10.section1

fun main() {
    val firstName: String?
    var lastName: String

    firstName = "정묵"
    lastName = "임"

    // if 문을 사용한 경우
    if (null != firstName) {
        print("$firstName $lastName")
    } else {
        print("$lastName")
    }

    println()

    // let 를 사용한 경우
    firstName.let { print("$it $lastName") } ?: print("$lastName")
}