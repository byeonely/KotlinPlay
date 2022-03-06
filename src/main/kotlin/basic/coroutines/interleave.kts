package basic.coroutines

import kotlinx.coroutines.*

suspend fun task1() {
    println("start task1 in Thread ${Thread.currentThread()}")
    yield()
    println("end task1 in Thread ${Thread.currentThread()}")
}

suspend fun task2() {
    println("start task2 in Thread ${Thread.currentThread()}")
    yield()
    println("end task2 in Thread ${Thread.currentThread()}")
}

println("start")

runBlocking {
    // Dispatchers.Default : 이 풀은 계산할 일이 많은 작업들을 위한 풀이다
    // Dispatchers.IO : IO 작업 실행을 위한 풀 안의 코루틴을 실행시키는데 사용될 수 있다
    // Dispatchers.Main : 안드로이드 기기와 Swing UI에서 사용된다(UI 업데이트 기능)
    // 코루틴은 병렬 실행을 할 수도 있고, 동시 실행을 할 수도 있다. 이런 실행방식은 컨텍스트에 따라 달라진다.

    // launch() 용 컨텍스트 설정(병렬 or 동시 실행)
    // task1()의 코드는 다른 스레드에서 실행되고 병렬 실행된다. task1() 을 제외한 모든 코드는 여전히 main 스레드에서 실행된다.
    launch(Dispatchers.Default) { task1() }

    // task2()의 코드는 main 스레드에서 실행되고 동시 실행된다
    launch { task2() }
    println("called task1 and task2 from ${Thread.currentThread()}")
}

println("done")