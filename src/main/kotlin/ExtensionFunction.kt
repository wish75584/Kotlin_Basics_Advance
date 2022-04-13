fun main(){

    println("Hello Kotlin".formatedString())
}
var num = 5
fun String.formatedString() : String{

    return  "$this $num"
}