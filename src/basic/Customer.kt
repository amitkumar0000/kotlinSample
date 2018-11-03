package basic

import java.lang.IllegalArgumentException
import java.util.*

class Customer(val id: Int, var name: String, val yearofbirth: Int){
    init {
        name = name.toUpperCase()
        println("Inside init block $id  $name ")
    }

    //secondary constructor
    constructor(email:String):this(0, "name", 40){
        println(email)
    }

    //Custom getter
    val age:Int
        get() = Calendar.getInstance().get(Calendar.YEAR)-yearofbirth

    var adharno:String = ""
        set(value) {
            if(!value.startsWith("AD"))
                throw  IllegalArgumentException("Adhar number should start with AD")
            field = value
        }
}

class Seller(val id:Int,val name:String="seller")