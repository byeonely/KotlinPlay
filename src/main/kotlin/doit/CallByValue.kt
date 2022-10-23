package doit

// 값에 의한 람다식 호출
fun main() {
    // lambda 함수를 매개변수로 lambda 라는 함수 이름만 넘기면 함수식 자체가 넘어가고
    // lambda() 라는 함수 이름 뒤에 () 괄호를 붙여서 넘기면 해당 시점에 함수를 실행(호출)시킨 후 리턴값이 매개변수로 넘어감
    // 즉 함수를 호출하냐 안하냐는 () 괄호로 결정됨
    val result1 = callByValue(lambda1("call1"))
    val result2 = callByValue(lambda2())
    println(result1)
    println(result2)
}

fun callByValue(b: Boolean): Boolean { // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

// 람다함수는 fun 으로 정의하지 않고 변수로 취급해서 val 이나 var 에 할당함
// 본래 람다함수는 이름이 없는 함수이므로 fun 구문 없이 {} 문으로 정의가 끝나고 그 이름이 없는 함수를 변수에 담음으로서 식별할 수 있는 이름을 부여해주는 것임
val lambda1: (String) -> Boolean = { str ->  // 람다 표현식이 2줄
    println("lambda1 function $str")
    true// 마지막 표현식 문장의 결과가 반환
}

// 람다함수는 fun 으로 정의하지 않고 변수로 취급해서 val 이나 var 에 할당함
// 본래 람다함수는 이름이 없는 함수이므로 fun 구문 없이 {} 문으로 정의가 끝나고 그 이름이 없는 함수를 변수에 담음으로서 식별할 수 있는 이름을 부여해주는 것임
val lambda2: () -> Boolean = {
    println("lambda2 function")
    false
}