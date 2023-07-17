fun main(){
   sayHello()
    sayHello("Anshu Kumar",29)
    sayHello("Vivek",30)
}

fun sayHello(name: String = "Nisha",age: Int = 24){
   // var number = age
    println("Hello, $name, $age")
}