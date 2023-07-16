fun main(){
    var x = 5
    var y = 3

   // val result = x + y
   // println("result = $result")
    println("x + y = ${x+y}")
    println("x - y = ${x-y}")
    println("x * y = ${x*y}")
    println("x / y = ${x/y}")
    println("x % y = ${x%y}")

    var result = x + y

    result += 2
    println("result = $result")

    result = result - 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    println("3 + 3 * 4 = ${3 + 3 * 4}")
    println("(3 + 3) * 4 = ${(3 + 3) * 4}")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")

   /* val isActive = false
    if (isActive == true){
        println("The user is active")
    }else{
        println("The user is not active")
    }
    val myNumber = 150
    if (myNumber < 150){
        println("less than 150")
    }else if (myNumber >= 150){
        println("Greater than or equal to 150")
    }else{
        println("All the conditions failed")
    }
    val isActive = false
    if (!isActive){
        println("The user is active")
    }else{
        println("The user is not active")
    }*/


}