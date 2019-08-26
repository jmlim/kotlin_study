package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    var num: Int? = null

    str1 = null // null 을 허용하지 않음(오류발생)
    println("str1: $str1, num: $num")
    println("str1: $str1, length: ${str1?.length}")
}