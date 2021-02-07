package chap04.section4

fun main() {
    //단순 메서드 체이닝을 사용할 때(요소 하나씩 순차적으로 처리)
    val list1 = listOf(1,2,3,4,5)
    val listDefault = list1
        .map { println("map($it) "); it*it}
        .filter{ println("filter($it) "); it % 2 == 0}
    println(listDefault)

    //asSequence 사용하기(위와달리 병렬처리하기때문에 훨씬 빠름)
    val listSeq = list1.asSequence()
        .map{print("map($it) "); it * it}
        .filter { println("filter($it) "); it % 2 == 0 }
        .toList()
    println(listSeq)
}