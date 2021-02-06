package chap02.section2

interface Score{
    fun getScore(): Int
}

enum class MemberType(var prio: String): Score {        //Score를 구현할 열거형 클래스
    NORMAL("Thrid") {
        override fun getScore(): Int = 100  //구현된 메서드
    },
    SILVER("Second"){
        override fun getScore(): Int = 500
    },
    GOLD("First"){
        override fun getScore(): Int = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for(grade in MemberType.values()){
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }
}