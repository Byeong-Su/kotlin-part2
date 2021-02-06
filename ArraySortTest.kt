package chap03.section2

import java.util.*

fun main() {
    val arr = arrayOf(8,4,3,2,5,9,1)

    //오름차순, 내림차순으로 정렬
    val sortedArr = arr.sortedArray()
    println(Arrays.toString(sortedArr))
    val sortedArrDesc = arr.sortedArrayDescending()
    println(Arrays.toString(sortedArrDesc))

    //인덱스 1~2까지 내용만 정렬
    arr.sort(1,3)
    println(Arrays.toString(arr))

    //List으로 반환
    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: "+listSorted)
    println("LST: "+listDesc)

    //SortBy를 이용한 특정 표현식에 따른 정렬
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy{item->item.length} //길이가 짧은 것부터 정렬
    println(Arrays.toString(items))
}