package doit

// 인자와 반환값이 없는 람다식 함수
fun main() {
    val out: () -> Unit = { println("Hello World!") } // 인자와 반환값이 없는 람다식의 선언
    // 자료형 추론이 가능하므로 val out = { println("Hello World!") }와 같이 생략 가능

    out()
    val new = out
    new()
}