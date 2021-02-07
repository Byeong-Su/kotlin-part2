package chap05.section1

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking{
    launch {
        delay(200L)
        println("Task from runBlocking")         //실행 4
    }

    coroutineScope {
        launch {
            delay(200L)
            println("Task from nested launch")         //실행 2
        }
        delay(200L)
        println("Task from coroutineScope")         //실행 1
    }
    println("end od runBlocking")         //실행 3
}