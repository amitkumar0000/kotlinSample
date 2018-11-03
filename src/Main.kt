import basic.Basic
import basic.Customer
import basic.Seller

class Main{
    companion object {
        private lateinit var varObj:Basic
        @JvmStatic fun  main(args:Array<String>){
            System.out.println("Hello kotlin")

//            basicOperation()
            classOPeration()
        }

        private fun classOPeration() {
            var cust = Customer(10, "hari",33 )
            cust.adharno = "AD1232"

            var cust1 = Customer("amit@kotlin.org")


            println("id:: ${cust.id}  name::${cust.name} age: ${cust.age} adhar no: ${cust.adharno}")

            dataClassOperation()

        }

        private fun dataClassOperation() {
            var seller1 = Seller(1,"ram","ram@gmail.com")
            var seller2 = Seller(1,"ram","ram@gmail.com")
            if(seller1 == seller2)
                println("Seller are same $seller1")

            var seller3 = seller1.copy(email="seller3@gmail.com")
            seller3.id = 2
            println(seller3)
            println(seller2)
        }

        fun basicOperation(){
            varObj = Basic()
            printAddress()
            print100()
            printlist()
            checkName()

            hello()
            printDetail()
        }

        private fun printDetail() {
            varObj.printDetail("hari",phone = "9999999",email = "heelo@gmail.com")
        }

        private fun hello() {
            varObj.hello()
//            varObj.throwException()
            println(varObj.sum(10,20))
            println(varObj.sum(10,20,30))

            varObj.printStrings("hello ","kotlin ", "programming")
        }

        private fun printAddress() {
            var varObj:Basic = Basic()
            varObj.printAddress()
        }

        private fun print100(){
            var varObj = Basic()
            varObj.print100()

            varObj.printRev100()
        }

        private fun printlist(){
            varObj.printlist()
        }

        private fun checkName(){
            varObj.isEqual("kotlin")
        }
    }
}
