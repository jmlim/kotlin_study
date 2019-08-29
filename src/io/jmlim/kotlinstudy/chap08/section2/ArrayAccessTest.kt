package io.jmlim.kotlinstudy.chap08.section2

import java.util.*

class MyClass(i: Int)

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr: ${Arrays.toString(arr)}") //배열의 내용을 문자열로 반환
    println("size: ${arr.size}")
    println("sum(): ${arr.sum()}")
    println(arr.get(2))
    println(arr[2])

    arr.set(2, 7)
    arr[0] = 8
    println("size: ${arr.size} arr[0]: ${arr[0]},arr[2]: ${arr[2]}")

    for (i in 0..arr.size - 1) {
        println("arr[$i] = ${arr[i]}")
    }

    // 다차원 배열 한번에 표기
    val array = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6, 7))
    println(Arrays.deepToString(array))

    // 표현식을 통해 배열 생성
    val arr3 = Array(5, { i -> i * 2 })
    println("arr3: ${Arrays.toString(arr3)}")

    // 요소 갯수가 많은 배열 생성
    var a = arrayOfNulls<Int>(1000) // 1000개의  null 로 채워진 정수배열
    var b = Array(1000, { 0 }) // 0으로 채워진 배열

    var c = Array(1000, { i -> MyClass(1) })

    // 배열에 요소 추가하고 잘라내기
    val arr1 = intArrayOf(1, 2, 3, 4, 5) // 5개로 고정된 배열
    val arr2 = arr1.plus(6) // 하나의 요소를 추가한 새 배열 생성
    println("arr2: ${Arrays.toString(arr2)}")

    // 기존 배열 잘라내기
    var arr4 = arr1.sliceArray(0..2);
    println("arr4: ${Arrays.toString(arr4)}")

    // 기타 배열 관련 APi
    println(arr.first())
    println(arr.last())
    println("indexOf(3): ${arr.indexOf(3)}")
    println("average: ${arr.average()}")
    println("count: ${arr.count()}")
    println("contains(4): ${arr.contains(4)}")
}