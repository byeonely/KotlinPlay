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

// 코루틴을 싱글 스레드 풀에서 실행시키는 방법
// 싱글 스레드 실행자
// 싱글 스레드 실행자를 만들기 위해 먼저 java.util.concurrent 패키지의 JDK Executors 컨커런시(동시실행)API를 사용할 수 있다.
// 일단 JDK 라이브러리를 이용해서 실행자를 만들면,
// 우리는 코틀린의 asCoroutineDispatcher() 확장함수를 이용해서 실행자로부터 CoroutineContext 를 가지고 올 수 있다
// 람다 표현식 .use{} 이 끝날 때 use() 함수가 실행자를 닫는다. 즉 코루틴이 완료되었다는 뜻이다.
Executors.newSingleThreadExecutor().asCoroutineDispatcher().use { context ->
    println("start")
    runBlocking {
        launch(context) { task1() }
        launch { task2() }
        println("called task1 and task2 from ${Thread.currentThread()}")
    }
    println("done")
}