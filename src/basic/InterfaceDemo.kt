package basic

interface cust{
    fun getID():Int

    fun store(){
        println("store in cust")
    }
}
interface cust1{
    fun getID1():Int
    fun store(){
        println("store in cust")
    }
}

interface resp<T>{
    fun getID():T
}

class sellPerson:cust,cust1{
    override fun store() {
        super<cust1>.store();
    }

    override fun getID1(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getID(): Int {
        return 10;
    }

}