package chap04.section1

fun main() {
    println("Enter the score: " )
    // readLine() -> 콘솔로부터 라인 입력받기 !! <- nonnull 단정기호
    val n = readLine()!!.toInt()

    for(line in 1..n) {
        for(space in 1..(n-line)) print(" ") // 공백출력
        for(star in 1..(2 * line - 1)) print("*") // 별표출력
        println() // 개행
    }
}
