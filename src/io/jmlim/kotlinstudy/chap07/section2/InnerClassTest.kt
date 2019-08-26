package io.jmlim.kotlinstudy.chap07.section2


// 1. 인터페이스의 선언
interface Switcher {
    fun on(): String
}

class SmartPhone(val model: String) {
    private val cpu = "Exynos"

    fun powerOn(): String {
        class Led(val color: String) { // 지역 클래스 선언
            fun blink(): String = "Blink $color on $model" // 외부의 프로퍼티 접근가능
        }

        val powerStatus = Led("Red") // 여기에서 지역 클래스가 사용됨
        // 2. 익명 객체를 사용해 Switcher의 on() 을 구현
        val powerSwitch = object : Switcher {
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        // 익명 객체의 메서드 사용.
        powerSwitch.on()
        return powerStatus.blink()
    } // powerOn() 블록 끝

    inner class ExternalStorage(val size: Int) {
        //바깥 클래스의 프로퍼티 접근
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    }
}

fun main() {
    val mySdcard = SmartPhone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())

    val myphone = SmartPhone("Note9")
    myphone.ExternalStorage(128)
    // 여기서 사용된 Led 클래스는 Smartphone 클래스의 메서드인 powerOn에서만 유효한 클래스이다.
    println(myphone.powerOn())
}