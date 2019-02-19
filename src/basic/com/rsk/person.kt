@file:JvmName("personfunction")

package basic.com.rsk

class person (var name:String){

    fun display(){
        println("name is {$name}")
    }

    fun displaywithlambda(function : (s:String) -> Unit){
        function(name)
    }
}