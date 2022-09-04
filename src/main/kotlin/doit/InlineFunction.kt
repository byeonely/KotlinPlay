package doit

// 인라인 함수
// 함수가 호출되는 곳에 함수 본문의 내용을 모두 복사해 넣는 것을 수행함.
// 이 같은 특성으로 함수의 분기 없이 처리되기 때문에 코드의 성능을 높일 수 있음.(overhead 가 없음)
// 람다식 매개변수를 가지고 있는 함수에서 동작함.
fun main() {
    shortFunc(3) { println("First call: $it") }
    shortFunc(5) { println("Second call: $it") }

    shortFunc2("apple") { println("Third call $it") }
    shortFunc2("banana") { println("Forth call $it") }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")

}

inline fun shortFunc2(a: String, out: (String) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}