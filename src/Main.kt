import basic.Basic

class Main{
    companion object {
        private lateinit var varObj:Basic
        @JvmStatic fun  main(args:Array<String>){
            System.out.println("Hello kotlin")
            varObj = Basic()
            printAddress()
            print100()
            printlist()
            checkName()
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
