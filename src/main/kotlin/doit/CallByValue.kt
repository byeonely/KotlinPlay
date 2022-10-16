package doit

fun main() {
    val result1 = callByValue(lambda1("call1"))
    val result2 = callByValue(lambda2())
    println(result1)
    println(result2)
}

fun callByValue(b: Boolean): Boolean { // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

val lambda1: (String) -> Boolean = { str ->  // 람다 표현식이 2줄
    println("lambda1 function $str")
    true// 마지막 표현식 문장의 결과가 반환
}

val lambda2: () -> Boolean = {
    println("lambda2 function")
    false
}