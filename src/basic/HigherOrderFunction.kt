package basic

class HigherOrderFunction {
}

data class HPerson(var name:String, var age:Int){
    fun printperson() = println(toString())
}

fun String.printline() = println("$this")

fun Int.printline() = println("$this")
