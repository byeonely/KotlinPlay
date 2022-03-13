import kotlinx.coroutines.*
import java.util.concurrent.Executors

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

// 싱글 스레드 풀 대신에 멀티플 스레드를 가지는드 풀(시스템의 코어 숫자만큼 스레드를 이용하고 싶다면)을 사용하고 싶은 경우
// CoroutineStart.UNDISPATCHED : 처음엔 현재 컨텍스트에서 실행되지만 서스펜션 포인트(yield()) 이후엔 스레드를 스위치해서 실행한다
Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()).asCoroutineDispatcher().use { context ->
    println("start")
    runBlocking {
        // launch 함수에 명시된 컨택스트의 스레드 : pool-1
        @OptIn(ExperimentalCoroutinesApi::class)
        launch(context = context, start = CoroutineStart.UNDISPATCHED) { task1() }
        launch { task2() }
        println("called task1 and task2 from ${Thread.currentThread()}")
    }
    println("done")
}