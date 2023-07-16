fun main(){
//    when(val alarm = 7){
//        in 1..15 -> {
//            println("The number is in the range 1..15")
//        }
//        12,7,14 -> {
//            println("The time is $alarm")
//        }
//        else -> {
//            println("The time is $alarm")
//        }
//    }
    val alarm = 7

    val text = when{
        alarm <= 10 -> "The number is in the range 1..10"
        alarm == 8 || alarm == 7 -> "The time is $alarm"
        else-> "The time is $alarm"
    }
    println(text)
}