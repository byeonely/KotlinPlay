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

// 코루틴을 한 컨텍스트에서 실행하다가 중간에 컨텍스트를 바꾸고 싶을 때 사용함
// 이 함수를 사용하면 코드의 한 부분을 코루틴의 다른 코드들과 완전히 다른 컨텍스트에서 실행시킬 수 있다
// 스레드가 달라지면 다른 스레드의 yield() 에도 영향을 받지 않게 된다
// 출력을 보면 withContext() 전달된 람다 코드를 제외한 모든 코드가 main 스레드([main,5,main])에서 동작하고 있고,
// withContext()에 전달된 람다에서 호출된 코드는 제공된 컨텍스트의 스레드(Thread[DefaultDispatcher-worker-1,5,main])에서 동작한다
// 하나의 컨텍스트는 하나의 스레드이다
runBlocking {
    println("starting in Thread ${Thread.currentThread()}")
    withContext(Dispatchers.Default) { task1() }
    launch { task2() }
    println("ending in Thread ${Thread.currentThread()}")
}