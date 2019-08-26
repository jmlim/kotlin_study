package chap04.section1

fun main() {
    println("Enter the score: " )
    // readLine() -> 콘솔로부터 라인 입력받기 !! <- nonnull 단정기호
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if(score >= 90.0) {
        grade = 'A'
    } else if(score in 80.0..89.9) {
        grade = 'B'
    } else if(score in 70.0..79.9) {
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}