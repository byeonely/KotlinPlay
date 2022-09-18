package doit

// 중위 함수
// 일종의 연산자를 구현할 수 있는 함수
// infix
// 중위 함수의 조건
//  멤버 메서드 또는 확장 함수여야 한다.
//  하나의 매개변수를 가져야 한다.
//  infix 키워드를 사용하여 정의한다.
fun main() {
    // 일반 표현법
    // val multi = 3.multiply(10)

    // 중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")
}

// int 를 확장해서 multiply() 함수를 하나 더 추가함
infix fun Int.multiply(x: Int): Int {
    return this * x
}