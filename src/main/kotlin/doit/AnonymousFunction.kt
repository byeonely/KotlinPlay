package doit

// 익명 함수
fun main() {
    val add: (Int, Int) -> Int = fun(x, y) = x + y
    val result = add(10, 2)
}