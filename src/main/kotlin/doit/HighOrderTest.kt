package doit

// 변수에 할당하는 람다식 함수 작성하기
fun main() {
    var result: Int
    // 람다식의 선언과 할당
    val multi: (Int, Int) -> Int /* 람다식의 자료형 선언 */ = {x: Int, y: Int /* 람다식의 매개변수 */-> x * y /* 람다식의 처리 내용 */} // 일반 변수에 람다식 할당
    result = multi(10, 20) // 람다식이 할당된 변수는 함수처럼 사용 가능
    println(result)

    val multi2: (Int, Int) -> Int = {x, y ->
        println("x * y")
        x * y
    }
    result = multi2(20, 20)
    println(result)

    // 다음은 모두 같은 표현임
    val multiLamda1: (Int, Int) -> Int = {x: Int, y: Int -> x * y} // 생략되지 않은 전체 표현
    val multiLamda2 = {x: Int, y: Int -> x * y} // 선언 자료형 생략
    val multiLamda3: (Int, Int) -> Int = {x, y -> x * y} // 람다식 매개변수 자료형의 생략

    val greet: () -> Unit = { println("Hello World!") } // 반환 자료형과 매개변수가 모두 없는 경우
    val greet2 = { println("Hello World!") } // 람다식의 자료형 선언 생략 가능
    val square: (Int) -> Int = {x -> x * x} // 반환 자료형과 매개변수가 각각 하나인 경우
    val square2: () -> Int = { 2 } // 반환 자료형만 있고 매개변수는 없는 경우
    println(square2())

    // 람다식의 자료형 선언 생략
    val skip1 = { println("Hello World!") } // 추론 가능
    val skip2 = {x: Int -> x * x} // skip2 의 자료형을 생략하려면 x 의 자료형을 명시해야 함
    val skip3 = {{ println("nested") }} // 추론 가능
}