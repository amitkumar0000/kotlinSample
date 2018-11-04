package basic

class Inventory{
    var amount : Double = 0.0
        get() = field
        set(value){
            if(value > 100)
                field = value
        }


}