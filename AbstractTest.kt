package chap02.section1

// 추상 클래스, 주 생성자에는 비추상 프로퍼티 선언의 매개변수 3개가 있음
abstract class Vehicle(val name: String, val color: String, val weight: Double) {

    // 추상 프로퍼티 (반드시 하위 클래스에서 재정의해 초기화해야 함)
    abstract var maxSpeed: Double

    // 일반 프로퍼티 (초기 값인 상태를 저장할 수 있음)
    var year = "2018"

    // 추상 메서드 (반드시 하위 클래스에서 구현해야 함)
    abstract fun start()
    abstract fun stop()

    // 일반 메서드
    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override  var maxSpeed: Double) : Vehicle(name, color, weight){
    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

    fun autoPilotOn(){
        println("Auto Pilot ON")
    }
}

class Motorbike(name: String, color: String, weight: Double, override  var maxSpeed: Double) : Vehicle(name, color, weight){
    override fun start() {
        println("Motorbike Started")
    }

    override fun stop() {
        println("Motorbike Stopped")
    }
}

fun main() {
    var car = Car("Matiz", "red", 1000.0,100.0)
    var motorbike = Motorbike("Motor1", "blue", 100.0, 100.0)

    car.year = "2014"
    car.displaySpecs()

    motorbike.displaySpecs()
    car.start()
    motorbike.start()
}