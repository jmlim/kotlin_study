package io.jmlim.kotlinstudy.chap08.section2

import io.jmlim.kotlinstudy.chap08.section2.sortwith.Product

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

    products.sortBy { it.price }
    products.forEach { println(it) }
}