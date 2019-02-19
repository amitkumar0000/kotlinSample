package basic

import basic.com.rsk.PersonEvent
import basic.com.rsk.handleEvent
import basic.com.rsk.person
import java.lang.NumberFormatException
import java.util.*


fun main(args: Array<String>){
    println("Hello kotlin")

    var kevin = person("Kevin")

    kevin.displaywithlambda{ name -> printName(name)}

    val message = if( 2== 2)
        "both are equals"
    else
        "both are not equals"

    printName(message)

    val numS = "432e"

    val num:Int? = try{
        Integer.parseInt(numS)
    }catch (e:NumberFormatException){
        null
    }

    println("Num is $num")

    for(i in 1..10 step 2)
        print(i)

    println()

    for(i in 10 downTo 1 step 2)
        print(i)

    println()
    for(i in 10 until 20)
        print(i)

    var number = listOf(1,2,34,6)
    for(i in number)
        println(i)


    var ages = TreeMap<String,Int>()
    ages["kevin1"] = 32
    ages["kevin2"] = 31
    ages["kevin3"] = 33
    ages["kevin4"] = 34

    for((name,age) in ages)
        println("$name is $age")

    for((index,element) in number.withIndex()){
        println("$element in $index")
    }

    println(max(10,20))

    log("hello")
    log()
    log(level = 20)
    log(message = "hijack kotlin")

    val text = "With multiple \t whitespace"
    println(text.replaceMultipleWhiteSpace())

    var h1 = Header("h1")
    var h2 = Header("h2")

    var h3 = h1 + h2
    var h4 = h3 plus  h2
    println(h3.name)
    println(h4.name)


    handleEvent(PersonEvent.Awake())
    handleEvent(PersonEvent.Asleep())
    handleEvent(PersonEvent.Aeating("Chicken"))

}

fun log(message:String = "Amit", level:Int = 10){
    println("$message with level $level")
}

fun String.replaceMultipleWhiteSpace():String{
    var regex = Regex("\\s")
    return regex.replace(this," ")
}


tailrec fun max(a:Int,b:Int):Int = if(a>b) a else b

fun printName(name:String){
    println(name)
}

class Header(var name:String){}

operator infix fun Header.plus(other:Header):Header{
    return Header(this.name + other.name)
}