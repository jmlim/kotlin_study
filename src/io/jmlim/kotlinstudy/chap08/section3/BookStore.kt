package io.jmlim.kotlinstudy.chap08.section3

import java.util.*

fun main() {
    val booksName = arrayOf("java", "c", "c++", "kotlin", "c#", "html")
    val price = 200.00f
    val studentDiscount = .25f
    val teacherDiscount = .15f

    val scanner = Scanner(System.`in`)
    println("** 정묵서점에 온것을 확인합니다")

    do {
        println(Arrays.toString(booksName))
        println("어떤 책을 원하시나요?")
        print("답변 : ")

        val book = scanner.nextLine()

        if (booksName.contains(book.toLowerCase())) {
            println("선택하신 책 $book 가격\$200")
            println("학생과 선생님인 경우에 할인 적용 당신의 직업은?(student, teacher, etc) ")
            print("답변 :")
            val occupation = scanner.nextLine()

            when (occupation.toLowerCase()) {
                "student" -> calcuatePrice(price, studentDiscount)
                "teacher" -> calcuatePrice(price, teacherDiscount)
                else -> println("할인을 적용할 수 없습니다. 최종 가격은 \$200 입니다.")
            }
        } else if (book == "exit" || book == "q") {
            break
        } else {
            println("죄송합니다. $book 의 재고가 없습니다.")
        }
    } while (true)
}

fun calcuatePrice(price: Float, studentDiscount: Float) {
    val result = price - (price * studentDiscount)
    println("최종 가격은 \$$result 입니다.")
}
