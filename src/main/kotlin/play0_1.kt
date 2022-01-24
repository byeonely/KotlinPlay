// 클래스의 기본 구조
fun main() {

    var person1 = Person1("박보영", 1990)

    println("안녕하세요, ${person1.birthYear}년생 ${person1.name}입니다")

    val person2 = Person2("진정국", 1997)
    val person3 = Person2("장원영", 2004)
    person2.introduce()
    person3.introduce()

    val person4 = Person3("이미주", 1994)
    val person5 = Person3("이루다")
    val person6 = Person3("차은우")
    val person7 = Person3("류수정")
}

// 기본 클래스
class Person1(var name: String, var birthYear: Int)

// 함수만 있는 클래스
class Person2(var name:String, var birthYear: Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다")
    }
}

// 초기화 함수 및 보조 생성자가 있는 클래스
class Person3(var name: String, var birthYear: Int) { // 기본 생성자
    // 생성자를 통해 인스턴스가 만들어질 때 호출되는 함수
    init {
        println("안녕하세요, ${birthYear}년생 ${name}입니다")
    }

    // 보조생성자
    constructor(name: String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다")
    }
}