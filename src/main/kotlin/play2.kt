fun main() {

    // 스코프 함수(5가지) : apply, run, with, also, let
    // 람다함수를 이용한 특별한 기능
    // 함수형 언어의 특징을 좀 더 편리하게 사용할 수 있도록 기본 제공하는 함수들
    // 클래스의 인스턴스를 스코프 함수에 전달해서 사용함
    // 인스턴스 -> 스코프 함수
    // 코드의 가독성을 향상시킴

    // 인스턴스 반환, 인스턴스 초기화할 때 사용
    // apply : 인스턴스를 생성 후 변수에 담기 전에 '초기화 과정' 을 수행하여 인스턴스 자신을 반환함
    //         참조연산자 없이 인스턴스의 변수와 함수를 사용
    // also : it을 통해서 인스턴스를 사용. 처리가 끝나면 인스턴스를 반환

    // 마지막 구문값 반환, 인스턴스의 속성이나 함수를 스코프 내에서 깔끔하게 조작할 때 사용
    // run == with : 인스턴스가 이미 만들어진 후 변수에 담기 전에 '조작 과정' 을 수행한 뒤 마지막 구문의 값을 반환함
    //               참조연산자 없이 인스턴스의 변수와 함수를 사용
    // let : it을 통해서 인스턴스를 사용. 처리가 끝나면 최종값을 반환

    var price = 5000

    var a = Book("디모의 코틀린책", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    println("a apply 상품명: ${a.name}, ${a.price}원")

    val runResult = a.run {
        println("a.run 상품명: ${name}, 가격: ${price}원")
    }
    println("run 수행 후 리턴값 : $runResult")

    val withResult = with(a) {
        println("with(a) 상품명: ${name}, 가격: ${price}원")
        2
    }
    println("with 수행 후 리턴값 : $withResult")

    a.let {
        println("a.let 상품명: ${it.name}, 가격: ${it.price}원")
    }


}

class Book(var name: String, var price: Int) {

    fun discount() {
        price -= 2000
    }

}

