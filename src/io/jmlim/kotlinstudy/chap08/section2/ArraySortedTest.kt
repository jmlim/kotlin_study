package io.jmlim.kotlinstudy.chap08.section2

import java.util.*

fun main() {
    val arr = arrayOf(1, 5, 2, 6, 2, 63, 9)
    // 1. 오름차순, 내림차순으로 정렬된 일반 배열로 반환
    val sortedNums = arr.sortedArray()
    println("ASC: ${Arrays.toString(sortedNums)}")

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DESC: ${Arrays.toString(sortedNumsDesc)}")

    // 2. 원본 배열에 대한 정렬
    arr.sort(1, 3) // sort(formIndex, toIndex)
    println("ORI: ${Arrays.toString(arr)}")
    arr.sortDescending()
    println("ORI: ${Arrays.toString(arr)}")

    // 3. List 로 반환
    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: ${listSorted}")
    println("LST: ${listDesc}")

    // 4. sortBy 를 이용한 특정 표현식에 따른 정렬
    val items = arrayOf<String>("dog", "cat", "lion", "kangaroo", "po")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))
}