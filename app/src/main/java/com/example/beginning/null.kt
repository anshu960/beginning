fun main() {
//    var text: String? = "Name"
//    text = null
//    if (text != null) {
//        println(text.length)
//    }else{
//        println("The variable is null")
//    }
//    var text: String? = "Name"
//    text = null
//        println(text?.length)
//    var text: String? = null
//    text = "Some text"
//    println(text!!.length)
    var text: String? = null
    text = "This variable is not null"
    val text2 = text ?: "Some text."
    println(text2)

}