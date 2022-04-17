fun mul(a: Int, b: Int): Int {
    return a * b
}

//we define the higher-order function having return type is a function.
fun highFun_3(): ((Int, Int) -> Int) {
    return ::mul
}

fun main(args: Array<String>) {
    // invoke function and store the returned function into a variable
    var funcall = highFun_3()
    // invokes the mul() function by passing arguments
    val result = funcall(5, 6)
    println("$result")
}
