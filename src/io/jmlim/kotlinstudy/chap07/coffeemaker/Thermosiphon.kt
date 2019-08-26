package io.jmlim.kotlinstudy.chap07.coffeemaker

//위임의 사용
class Thermosiphon(heater: Heater) : Pump, Heater by heater {
    override fun pump() {
        if (isHot()) {
            println("[Thermosiphon] pumping...")
        }
    }
}