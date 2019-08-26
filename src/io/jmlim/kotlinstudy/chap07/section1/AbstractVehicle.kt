package io.jmlim.kotlinstudy.chap07.section1

// 추상클래스, 주 생성자에는 비추상 프로퍼티 선언의 매개변수 3개가 있음
abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    // 추상 프로퍼티 (반드시 하위 클래스에서 재정의해 초기화해야함)
    abstract var maxSpeed: Double

    // 일반 프로퍼티
    var year = "2018"

    // 추상 메서드
    abstract fun start()

    abstract fun stop()

    // 일반 메서드
    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        // 코드의 구현
        println("Car started")
    }

    override fun stop() {
        // 코드의 구현
        println("Car stopped")
    }
}

class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed: Double) :
    Vehicle(name, color, weight) {
    override fun stop() {
        // 코드의 구현
        println("Bike started")
    }

    override fun start() {
        // 코드의 구현
        println("Bike stopped")
    }
}

fun main() {
    val car = Car("장모님차 마티즈","yellow", 1110.0, 270.0)
    val moter = Motorcycle("정묵바이크", "red", 180.0, 120.0)

    car.year = "2013"

    car.displaySpecs()
    car.start()

    moter.displaySpecs()
    moter.start()
}