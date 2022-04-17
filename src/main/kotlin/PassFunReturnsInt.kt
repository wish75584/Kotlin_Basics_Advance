fun newFun(i: Int, j: Int): Int {
    var result = i + j;
    return result
}

fun highFun2(newFun: (Int, Int) -> Int) {
    var result = newFun(3, 6)
    println("$result")
}

fun main(args: Array<String>) {
    highFun2(::newFun)
}