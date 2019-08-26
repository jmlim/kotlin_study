package io.jmlim.kotlinstudy.chap07.coffeemaker

interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}