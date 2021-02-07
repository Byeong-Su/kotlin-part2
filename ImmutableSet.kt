package chap04.section2

fun main() {
    val mixedTypeSet = setOf("Hello", 5, "world", 3.14, 'c')    //자료형 혼합 초기화
    var intSet: Set<Int> = setOf<Int>(1,5,5)    //정수형만 초기화(중복된것은 하나로 취급됨 ->여기서는 5가 한번만 출력됨)

    println(mixedTypeSet)
    println(intSet)

    //가변형 Set 정의하기
    val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals)
    //요소의 추가
    animals.add("Dog")  //이미 존재하므로 변화 없음
    println(animals)
    //요소의 삭제
    animals.remove("Python")
    println(animals)

    //HashSet의 생성
    val intsHashSet: HashSet<Int> = hashSetOf(6,3,4,7)  //불변성 기능이 없음
    intsHashSet.add(5)  //추가
    intsHashSet.remove(6)   //삭제
    println(intsHashSet)
}