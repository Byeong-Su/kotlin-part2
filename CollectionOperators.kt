package chap04.section4

fun main() {
    val list1 = listOf("one", "two", "three")
    val list2 = listOf(1,2,3)
    val map1 = mapOf("hi" to 1, "hello" to 2, "Goodbye" to 3)

    println(list1 + "four") //기존 컬렉션에 추가가 아닌 새로운 컬렉션에 four추가해 출력
    println(list2 + 4)
    println(list2 - 1)  //1 삭제
    println(list1 + listOf("abc", "def"))   //두 List의 병합
    println(list2 - listOf(3,4,5))  //일치하는 요소의 제거
    println(map1 + Pair("Bye",4))   //Pair()를 사용한 Map의 요소 추가
    println(map1 - "hello") //일치하는 값의 제거
    println(map1 + mapOf("Apple" to 4, "Orange" to 5))  //Map의 병합
    println(map1 - listOf("hi","hello"))    //List에 일치하는 값을 Map에서 제거
}