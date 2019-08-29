package io.jmlim.kotlinstudy.chap08.section1.limit

class InOutTest<in T, out U>(t: T, u: U) {
    // val propT: T = t // T 는 in 위치이기때문에 out 위치에서 사용불가
    val propU: U = u // U는 out 위치로 가능

    // fun func1(u: U) // 오류! U는 out 위치이기 때문에 in 위치에 사용불가
    fun func2(t: T) {
        // T는 in 위치에 사용됨
        print(t)
    }
}

fun starTestFunc(v: InOutTest<*, *>) {
    // v.func2(1) // 오류! Nothing 으로 인자를 처리함.
    print(v.propU)
}