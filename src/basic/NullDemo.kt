package basic

class NullDemo{
    //type? implies it can hold null object
    var message:String? = null

    fun printMessage(){
        //message? implies if message is not null then compute lenght
        println(message?.length)
        //message!!  implies override compiler check
//        println(message!!.length)
    }
}