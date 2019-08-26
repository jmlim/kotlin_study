package chap03.section2

fun main(args: Array<String>) {
    // 4개의 인자 구성
    normalVarargs(1, 2, 3, 4)
    // 3개의 인자 구성
    normalVarargs(4, 5, 6)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        println("$num")
    }
    print("\n")
}
