package io.jmlim.kotlinstudy.chap07.section2

interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String) : Score {
    NORMAL("Thrid") {
        override fun getScore(): Int = 100
    },
    SILVER("Second") {
        override fun getScore(): Int = 500
    },
    GOLD("First") {
        override fun getScore(): Int = 1500
    },
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    // 모든 값을 가져오는 반복문
    for (grade in MemberType.values()) {
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }
}