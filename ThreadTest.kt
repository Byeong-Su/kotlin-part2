package chap05.section1

//클래스
class SimpleThread: Thread(){
    override fun run() {
        println("Class Thread ${Thread.currentThread()}")
    }
}


//인터페이스
class SimpleRunnnable:Runnable{
    override fun run(){
        println("Interface Thread ${Thread.currentThread()}")
    }
}

fun main() {
    val thread = SimpleThread()

    thread.start()

    val runnable = SimpleRunnnable()
    val thread2 = Thread(runnable)
    thread2.start()

    //익명객체
    object : Thread(){
        override fun run(){
            println("object Thread ${Thread.currentThread()}")
        }
    }.start()

    //람다식
    Thread{
        println("Lambda Thread ${Thread.currentThread()}")
    }
}