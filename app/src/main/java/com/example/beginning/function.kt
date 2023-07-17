fun main() {
//   sayHello()
//    sayHello("Anshu Kumar",29)
//    sayHello("Vivek",30)
//    val hasInternetConnection = true
//    if (!hasInternetConnection){
//        getData("Some data")
//    }else{
//        showMessage()
//    }
//}
//
//fun showMessage() {
//    println("There's no internet connect")
//}
//
//fun sayHello(name: String = "Nisha",age: Int = 24){
//   // var number = age
//    println("Hello, $name, $age")
//}
//fun getData(data: String){
//    println("Your data is: $data")
   val max = getMax(5,9)
    println(max)

   val get = getMaxim(15,25)
    println(get)
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
  return max
}
fun getMaxim(a: Int, b: Int): Int{
    if (a>b){
        return a
    }else{
        return b
    }
}