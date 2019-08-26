package chap03.section2

fun main(args: Array<String>) {

    // x, z의 이름과 함께 함수 호출( y는 기본값 사용)
    namedParam(x = 200, z = 100)
    //z의 이름과 함께 함수 호출(x 와 y는 기본 값으로 지정됨)
    namedParam(z = 150)
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}
