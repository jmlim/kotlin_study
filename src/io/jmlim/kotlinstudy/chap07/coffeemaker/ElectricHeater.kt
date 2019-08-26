package io.jmlim.kotlinstudy.chap07.coffeemaker

class ElectricHeater(var heating: Boolean = false) : Heater {
    override fun on() {
        println("[EletricHeater] heating...")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean = heating

}