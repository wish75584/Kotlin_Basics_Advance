 var lambda2 = {a:Int , b:Int -> a+b}

 fun highFun(lmbd : (Int,Int)-> Int){
     var result= lmbd(2,4)
     println("Result of Lambda = $result")
 }
 fun main(args : Array<String>){
     highFun(lambda2)
 }