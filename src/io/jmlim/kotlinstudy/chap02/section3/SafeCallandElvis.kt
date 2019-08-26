package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null

    //세이프 콜과 엘비스 연산자 활용
    //문자가 있는 경우엔 길이를 보여주며 없으면 -1로 출력되도록
    println("str1 : $str1 length: ${str1?.length ?: -1}")
}