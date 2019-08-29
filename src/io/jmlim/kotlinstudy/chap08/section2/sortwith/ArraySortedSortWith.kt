package io.jmlim.kotlinstudy.chap08.section2.sortwith

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone", 11.00),
        Product("Drone", 444.00),
        Product("Mouse", 333.00),
        Product("Keyboard", 222.00),
        Product("Monitor", 555.00),
        Product("Tablet", 666.00)
    )

    products.sortWith(Comparator<Product> { p1, p2 ->
        when {
            p1.price > p2.price -> 1
            p1.price == p2.price -> 0
            else -> -1
        }
    })

    products.forEach { println(it) }

    println()

    // compareBy 를 함께 사용해 2개의 정보 정렬
    products.sortWith(compareBy({ it.name }, { it.price }))
    products.forEach { println(it) }
}