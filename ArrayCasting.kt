package chap03.section2

import java.util.*

fun main() {
    val b = Array<Any>(10,{0})  //Any를 이용해 모든타입이 다 이용가능하게 함
    b[0] = "Hello World"
    b[1] = 1.1

    println(Arrays.toString(b))
}