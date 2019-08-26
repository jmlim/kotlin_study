package chap02.section3

fun main() {
    val num = 256

    // num 이 int 형일 때
    if (num is Int) {
        print(num)
    }
    // num 이 int 형이 아닐 때(!num is Int) 와 동일
    else if (num !is Int) {
        print("Not a Int")
    }
}