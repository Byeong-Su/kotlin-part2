package chap05.section1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World")
        doSomething()
    }
    println("Hello")
    println("job: ${job.isActive}, ${job.isCancelled}")
    Thread.sleep(2000L)
    println("job: ${job.isActive}, ${job.isCancelled}")
}

//suspend : 루틴을 일시 중단
suspend fun doSomething(){
    println("doSomething")
}