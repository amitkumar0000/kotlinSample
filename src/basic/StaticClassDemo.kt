package basic

class SingletonClassDemo{

    var num:Int = 0
    private constructor()

     companion object Factory{
        var _singleInstance:SingletonClassDemo? = null

         fun  getInstance():SingletonClassDemo?{
            synchronized(this) {
                if (_singleInstance == null)
                    _singleInstance = SingletonClassDemo()
            }
            return _singleInstance;
        }
    }

    fun printMessage(){
        num++
        println("This is singleton Class $num")
    }
}