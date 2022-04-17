fun newFun(s:String):Unit{
    print(s)
}
 fun highFun(s:String , newFun:(String)->Unit){
     newFun(s)
 }

fun main(args : Array<String>){
    highFun("ram",::newFun)
}