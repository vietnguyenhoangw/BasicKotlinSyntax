package part_5
/**
 * part 5
 * Advance Function
 * docs: https://cungdev.com/ham-trong-kotlin-nang-cao/
 */

import java.text.SimpleDateFormat
import java.util.*

//Top-level function
fun getCurrentDate() : String {
    val date = Date()
    val dateFormat = "dd/MM/yyyy"
    val sdf = SimpleDateFormat(dateFormat)

    return sdf.format(date)
}

//Lambda function
var message = {
    print("hello Kotlin!")
}

var message2 = {
    str : String ->
    println(str)
    print ("End lambda function")
}

var fullname = {
    first_name : String,
        last_name : String ->
    println("$first_name $last_name")
}

// Higher-order functions, using lambda like a input argument
fun printSummary(number1: Int, number2: Int, summaryFunction: (Int, Int) -> Int) {
    val sum = summaryFunction(number1, number2)
    print("Sum of $number1 and $number2 is $sum")
} // using 'printSummary(2,3, summaryFunction = {a, b -> 2 + 3})' to call this function

// "it" argument
fun printDouble(number : Int, doubleFunction : (Int) -> Int) {
    val double = doubleFunction(number)
    print("Double $number is $double")
} // the orther ways to call this function don't using 'printDouble(3, doubleFunction = {a -> a * 2})'
    // is using "it" -> 'printDouble(3) {it * 2}'

fun ex2() {
    val listPlayer = arrayListOf<String>("Ronaldo", "Messi", "Neymar", "Rua 1 dau", "Mbape", "rollRoyce")
    val listR = listPlayer.filter {
        it.startsWith("R", true)
    }

    println(listR)
}

// return in lambda function
fun testReturnFunction() {
    val intList = intArrayOf(1, 2, 3, 4, 5)
    intList.forEach labelForEach@ {
        if (it % 3 == 0) {
            return@labelForEach
        }
    }

    println("end of the function")
}
// labelForEach is a forEach's label, when we want to return we will using this
// return will be end if the method have labelForEach


// Extension function
fun toUpperCase_simple() {
    val normalString = "abcdef"
    val upperCaseString = normalString.toUpperCase()
    print(upperCaseString)
}

fun String.upperFirstLetter(): String {
    val firstLetter = this.substring(0, 1).toUpperCase() // get the first char, to upper case
    return firstLetter.plus(this.substring(1)) // Connect the first char to the rest of the string
} //using this function following this:
    // - create a string variable
    // - val's name.upperFirstLetter