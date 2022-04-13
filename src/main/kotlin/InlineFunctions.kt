fun main() {
    //here are we calling loop function inside the function call
    calculatetime { loop(5) }
}

inline fun calculatetime(fn: () -> Unit) //in here lamda has been taken as a paramter
{
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken ${end - start} ms ")
}


//in here loop is a  function by which we are putting calculatetime function into the loop
fun loop(n: Long) {
    for (i in 1..n) {
        //
        println("inside the loop function")
    }
}