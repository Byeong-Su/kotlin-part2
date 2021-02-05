package chap01.section2

class Bird(var name: String, val wing: Int, var beak: String){

    /*//부생성자
    constructor(_name: String, _wing: Int, _beak: String){
        this.name =_name
        this.wing = _wing
        this.beak = _beak
    }*/

/*    //초기화 블록
    init {
        println("-----init start-----")
        name = name.capitalize()
        println("name: $name, wing: $wing, beak: $beak")
        println("-----init end-----")
    }*/

    fun fly(){
        println("Fly")
    }
}

fun main() {

    val coco = Bird("coco", 2, "long")

    coco.fly()

    println(coco.name)
}