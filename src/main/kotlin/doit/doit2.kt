package doit

fun main() {

    val thread1 = SimpleThread()
    thread1.start()

    println("1")

    val runnable = SimpleRunnable()
    val thread2 = Thread(runnable)
    thread2.start()

    println("2")

}

// 1. Thread 클래스를 상속받아 구현하기
class SimpleThread: Thread() {
    override fun run() {
        println("Current Threads1: ${Thread.currentThread()}")
    }
}

// 2. Runnable 인터페이스로부터 run() 메소드 구현하기
class SimpleRunnable: Runnable {
    override fun run() {
        println("Current Threads2: ${Thread.currentThread()}")
    }
}