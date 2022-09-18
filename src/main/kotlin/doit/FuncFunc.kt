package doit

// 고차함수
// 반환값에 일반 함수 사용해 보기
fun main() {
    println("funcFunc: ${funcFunc()}")
}

// 함수를 리턴하는 고차함수
fun funcFunc(): Int { // 함수의 반환값으로 함수 사용
    return sum(2, 2) // 함수를 리턴함
}