package basic

enum class Priority(var value:Int,var nme:String){
    MINOR(0,"MINOR") {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },MAJOR(10,"MAJOR"){
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override  fun toString(): String {
            return "Major priorities"
        }
    }
    ,NORMAL(9,"NORMAL") {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },HIGH(-19,"HIGH") {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text():String
}