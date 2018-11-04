package basic

class DirectoryExplorer(val user: String){
    class Permission{
        fun validatePermission(user:String):Boolean{
            return user.startsWith("PC")
        }
    }

    //inner class has excess to field of outer class.
    inner class InnerClass(){
        fun permissionCheck(){
            if(user != "hadi")
                println("not a user")
            else
                println("Is a User")
        }
    }

    fun listfolder(folder:String, user:String){
        val permissionCheck = Permission()
        permissionCheck.validatePermission(user)
    }


}