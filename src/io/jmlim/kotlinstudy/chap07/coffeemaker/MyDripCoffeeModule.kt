package io.jmlim.kotlinstudy.chap07.coffeemaker

/**
 * MyDripCoffeeModule 클래스에서는 by lazy 를 사용해
 * 전기 히터 ElectricHeater와 Thermosiphon 이 접근되는 시점에 초기화하도록 하고 있음.
 */
class MyDripCoffeeModule : CoffeeModule {

    companion object {
        val electricHeater: ElectricHeater by lazy {
            ElectricHeater()
        }
    }

    private val _thermosiphon: Thermosiphon by lazy {
        Thermosiphon(electricHeater)
    }


    override fun getThermosiphon(): Thermosiphon = _thermosiphon
}