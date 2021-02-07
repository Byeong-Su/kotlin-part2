package chap04.section1

fun main() {
    //불변형 List의 사용
    var numbers: List<Int> = listOf(1,2,3,4,5)
    var names: List<String> = listOf("one", "two", "three")

    for (name in names){
        println(name)
    }
    for(num in numbers) print(num)  //한줄에서 처리하기
    println()
}