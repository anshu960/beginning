fun main(){
    val x = 5
    val y = 3

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
}