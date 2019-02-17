import basic.*

class Main{
    companion object {
        private lateinit var varObj:Basic
        @JvmStatic fun  main(args:Array<String>){
            System.out.println("Hello kotlin")

//            basicOperation()
//            classOPeration()

              highOrderFunction()
        }

        private fun highOrderFunction() {
            val firsterson = HPerson("john",29)
            val secongperson = HPerson("rahul   ",30)

            val olderPerson = if(firsterson.age > secongperson.age) firsterson else secongperson

            olderPerson.name.printline()

            run{
                if(firsterson.age > secongperson.age) firsterson else secongperson
            }.age.printline()

            with(firsterson){
                age = age + 2
                "$age"
            }.printline()

            firsterson.run{
                age = age + 2
                "$age"
            }.printline()

            firsterson.let {
                modifiedPerson -> modifiedPerson.age +1
                "Age is now ${modifiedPerson.age}"
            }

            firsterson.apply {
                age += 1
                name = "ram"
            }.printperson()


            secongperson.also {
                it ->
                it.age += 2
                it.name = "Rahul"
            }.printperson()

        }

        private fun classOPeration() {

//            normalOperation()
//            dataClassOperation()

//            enumClassOPeration()

//            globalObjet()

//            interfaceDemo()

//            nullDemo()

//            customGetterSetter()

//            innerClassDemo()

//            singletonClassDemo()

            talkingToJava()



        }

        private fun talkingToJava() {
            var talkToJava = CustomJava()
            talkToJava.id = 123
            talkToJava.name = "kotlin"
            println("Talk to java ${talkToJava.id}  ${talkToJava.name}")
        }

        private fun singletonClassDemo() {
            var singleObj = SingletonClassDemo.getInstance()
            singleObj?.printMessage()

            var singleObj1 = SingletonClassDemo.getInstance()
            singleObj1?.printMessage()
        }

        private fun innerClassDemo() {
            var nestedclass = DirectoryExplorer("hadi")
            nestedclass.listfolder("abc","hadi")

            var innerClass = nestedclass.InnerClass()
            innerClass.permissionCheck()

        }

        private fun customGetterSetter() {
            var custom = Inventory()
            println("amount ${custom.amount}")
            custom.amount = 200.0
            println("amount ${custom.amount}")
            custom.amount = 40.0
            println("amount ${custom.amount}")


        }

        private fun nullDemo() {
            var n = NullDemo()
            n.printMessage()
        }

        private fun interfaceDemo() {
            var c = sellPerson()

            c.store()
        }

        private fun globalObjet() {
            println(Global.pi)

            var localObj = object{
                val pi = 31.4
            }

            println(localObj.pi)
        }

        private fun enumClassOPeration() {
            var priority = Priority.MAJOR
            println(priority)
            println("${priority.value} ${priority.nme} ${priority.ordinal} ${priority.name}")

            for(prio in Priority.values())
                println("${prio.ordinal} ${prio.name}")
        }

        private fun normalOperation(){
            var cust = Customer(10, "hari",33 )
            cust.adharno = "AD1232"

            var cust1 = Customer("amit@kotlin.org")


            println("id:: ${cust.id}  name::${cust.name} age: ${cust.age} adhar no: ${cust.adharno}")
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
