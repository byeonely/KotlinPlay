// 생성자 없이 객체를 직접 만들어내는 object
// common object
// 공통적인 속성과 함수를 사용해야할 때 사용함
// Singleton Pattern 을 언어 차원에서 지원하는 것임
fun main() {

    println(Counter2.count)

    Counter2.countUp()
    Counter2.countUp()

    println(Counter2.count)

    Counter2.clear()

    println(Counter2.count)
}

object Counter2 {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}