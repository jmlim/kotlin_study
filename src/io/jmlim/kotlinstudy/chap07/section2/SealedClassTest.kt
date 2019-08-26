package io.jmlim.kotlinstudy.chap07.section2

// 실드 클래스를 선언하는 첫 번째 방법
sealed class Result {
    open class Success(val message: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}

class Status : Result() // 실드 틀래스 상속은 같은 파일에서만 가능
class Inside : Result.Success("Status") // 내부 클래스 상속

