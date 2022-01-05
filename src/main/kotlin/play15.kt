// 나머지 컬렉션 함수
fun main() {

    // associateBy : Map<K, T>
    // 아이템에서 key 를 추출하여 Map(컬렉션) 으로 변환하는 함수.
    // associateBy 함수 내에 keySelector 로 정의된 값이 반환되는 map 에서 key 가 되고 객체가 value 가 됨.
    // 컬렉션에서 특정 속성의 값을 key 로 하는 map 으로 만들고 싶을 때 사용. 특정 속성의 값이 중복되는 객체들이 존재할 경우 중복된 객체들 중 가장 마지막에 있는 객체만 반환되는 Map 에 포함됨
    // DB Table 에서 select 해서 가져온 결과 객체 리스트를 Map 으로 가공해서 사용하고자 할 때 사용할 것 같음

    // groupBy : Map<K, List<T>>
    // key 가 같은 아이템끼리 배열로 묶어 Map(컬렉션) 으로 만드는 함수.
    // groupBy 함수 내에 keySelector 로 정의된 값이 반환되는 Map 에서 key 가 되고 그룹핑된 객체(List)가 value 가 됨.
    // 컬렉션에서 특정 속성의 값이 같은 객체들끼리 N개의 그룹으로 그룹핑하고 싶을 때 사용

    // partition : Pair<List<T>, List<T>>
    // 아이템에 조건을 걸어 true/false 에 따라 두개의 컬렉션(List)으로 나누고(그룹핑) Pair 로 만드는 함수
    // 컬렉션을 이등분 하고 싶을 때 사용

    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(Person("유나", 1992),
                            Person("조이", 1996),
                            Person("츄", 1999),
                            Person("유나", 2003))

    println(personList.associateBy { it.birthYear })
    println(personList.groupBy { it.name })

    val partitionedList = personList.partition { it.birthYear > 1998 }
    println(partitionedList.first)
    println(partitionedList.second)
    val (over98, under98) = personList.partition { it.birthYear > 1998 }
    println(over98)
    println(under98)

    // collection.flatMap {}
    // 아이템마다 만들어진 컬렉션을 합쳐서 반환

    val numbers = listOf(-3, 7, 2, -10, 1)
    println(numbers.flatMap { listOf(it*10, it+10) })

    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })

    val names = listOf("A", "B", "C", "D")
    println(names zip numbers)
}


