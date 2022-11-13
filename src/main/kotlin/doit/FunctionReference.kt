package doit

// 참조에 의한 호출 방식으로 일반 함수 호출하기
// 일반 함수를 람다식 처럼 사용할 때 일반 함수 이름 앞에 :: 를 붙여준다
fun main() {
    // 1. 인자(일반함수)와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sum)
    println(res1)

    // 1.1 인자(람다함수)와 반환값이 있는 함수
    val res2 = funcParam(5, 6, sumLambda)
    println(res2)

    // 2. 인자가 없는 함수
    hello(::text) // 인자로 람다식 처럼 일반 함수 이름 앞에 :: 를 붙여서 넣어줌
    hello({ a, b -> text(a, b) }) // 인자로 괄호 안에 람다 함수를 넣어줌
    hello { a, b -> text(a, b) } // 인자로 괄호를 생략하고 람다 함수를 넣어줌

    // 3. 일반 변수에 값처럼 할당
    val likeLambda = ::sum
    println(likeLambda(6, 6))
}

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun text(a: String, b: String) = "Hi! $a $b"

fun hello(body: (String, String) -> String) {
    println(body("Hello", "World"))
}

// 람다함수
// 람다함수는 함수 이름이 없고, 변수에 담겨 변수 처럼 사용됨
val sumLambda: (Int, Int) -> Int = {x, y -> x + y}