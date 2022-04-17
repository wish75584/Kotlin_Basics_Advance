

var lambda={println("Welcome to lambda function")}
//define a lambda expression which contains print() to print string to the standard output.

fun highOrderFun(lmbd:()-> Unit){
//    lmbd is local name for the receiving lambda parameter.
//    () represents that the function does not accept any arguments.
//    Unit represents that function does not return any value.
lmbd()
}
fun main(args : Array<String>){
    highOrderFun(lambda)
    // invoked the higher-order function by passing the lambda expression as parameter.
}