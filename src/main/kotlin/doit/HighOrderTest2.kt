package doit

// 고차함수 : 다른 함수(고차함수)를 인자로 사용하거나 함수를 결괏값으로 반환하는 함수
// 매개변수에 람다식 함수를 이용한 고차 함수
fun main() {
    var result: Int = highOrder({x, y -> x + y}, 10, 20) // 람다식을 매개변수와 인자로 사용한 함수
    println(result)
    result = highOrder(sum3, 30, 40)
    println(result)
}

// 고차함수
// 매개변수가 Int 형 2개, 반환값이 Int 인 "함수를 인자"로 갖는 고차함수
// test(sum(1, 2)) 과 같이 함수의 결과값을 CallByValue 로 인자로 갖는 일반함수와의 차이점은
// 일반함수의 경우에는 함수의 호출시점을 제어할 수 없으나, 고차함수의 경우에는 함수의 정의 자체가 매개변수로 들어왔기 때문에
// 일반변수(일급객체) 처럼 매개변수를 받은 함수 내에서 원하는 시점에 1회 이상 사용이 가능함
// 이러한 특징은 고차함수를 호출하여 매개변수를 전달하는 시점에 어떠한 값이 아닌, 이름이 없는 함수인 람다함수로 직접 함수 로직 자체를 전달시킬 수 있음
// 고차함수에서 함수형 매개변수를 정의할 때는 변수명과 함께 람다식으로 형 정의를 해줌
// 고차함수에서 함수형 매개변수를 받는 이유는 본 함수 내에 어딘가에서 해당 함수를 적절한 시점에 사용하기 위함일 것으로 생각됨
// 결국 고차함수는 함수(람다식 함수)를 변수처럼 주고 받기 위해서 존재함
// 함수를 변수처럼 주고받게 되면 이쪽 저쪽 다른쪽에서도 함수의 로직이 사용 가능하게 됨
// 함수가 갖고 있는 로직의 재활용 및 반복문에 적용하면 파워풀해질 것 같음
fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    val value = sum(a, b)
    return sum(a, b + value)
}

fun highOlder2(sum: (Int, Int) -> Int, a: Int, b: Int): (Int, Int) -> Int {
    return sum3
}

fun sum2(x: Int, y: Int): Int {
    return x + y
}

val sum3 = {x: Int, y: Int -> x + y}