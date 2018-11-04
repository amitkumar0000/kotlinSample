package basic

class Inventory{
    var amount : Double = 0.0
        get() = field*2
        set(value){
            if(value > 100)
                field = value
        }


}