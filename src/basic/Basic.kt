package basic

import java.util.stream.Collectors

class Basic{
    var streetNum:Int = 10
    var streetName = "kasvanahalli"
    var myLong = 10L
    var myfloat = 10F
    var mydouble = 10f
    var myBinary = 0xff
    var myLongagain = streetNum.toLong()
    var myChar = 'a'
    var myString = "myString"

    val zip = "560035"

    var address = "streetNum:: $streetNum  streeName:: $streetName  ${streetName.length}";

    fun printAddress(){
        System.out.print(address +" address len:: "+ getAddressLen())
    }

    fun getAddressLen():Int{
        return address.length
    }

    fun print100(){
        for(num in 1..10)
            println(num)
        var number = 1..10
        var odd =  number.filter { n->n%2!=0 }
        var even =  number.filter { n->n%2==0 }.map { i->i*i }

        for(num in odd)
            print("$num ")

        println("$even ")
    }

    fun printRev100(){
        for(num in 10 downTo 1)
            print("$num ")
        for(n in 10..1)
            println("$n ")
        loop@ for(num in 100 downTo 1 step 10)
            println("$num ")
    }

    fun printlist(){
        var city = listOf("London","canada","bali","hongkong")
        for(c in city )
            println(c)
    }

    fun isEqual(str:String){

        var result = if(str=="kotlin") {
            print("kotlin")
        }
        else
            "not a name"
        System.out.println(result)


        var whenValue = when(result){
            is String -> {
                print("Kotlin match")
                "remove that"
            }
            "value" -> {
                print(result)
                "remove that"

            }
            "not a name" -> {
                print("not a name")
                "remove that"
            }
            is Int -> {
                print("int")
                "remove that"
            }
            20 -> {
                print("$result is a number")
                "remove that"
            }
            else -> {
                print("not a result")
                "remove that"
            }

        }

        println(" \nwhenvalue  $whenValue")
    }

}