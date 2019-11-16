package part_4
/**
 * part 4
 * Function
 * docs: https://cungdev.com/su-dung-ham-trong-kotlin/
 */

// create a function with a parameter and no parameter
fun message_function(name : String) : String {
    return "Hello, this is a message: $name"
}

fun say_hello() : String {
    return "Hello world!"
}

fun say_yourname(name : String) {
    print("Your name is: $name")
}

/// Unit in Kotlin is similar with Void in Java
//  Unit is a special data type
//  When you using Unit, you no need to use return
fun message3_function(name : String) : Unit {
    print("Message 3: $name")
}

// create a function with default parameter
// if you do not assign any value for this function, that will using default value
fun function_with_defaultparameter(name : String = "Set the parameter's value!") : Unit{
    print("Hello: $name")
}

// using var's name when you call and set value for function
fun say_fullname(firstname : String, middleName : String = "Hoang", lastName : String) {
    print("Full name: $firstname $middleName $lastName")
}
// -> when you call this fuction
// you should write: say_fullname(firstname = Nguyen, lastName = Viet)
// resutl is Nguyen Hoang Viet

// Function with single line
fun sum_of_twoNumbers(a : Int, b : Int) = a + b
fun doubleNumber(number : Int) = 2 * number

// Function without parameter limited
fun getSum(vararg numbers: Int): Int {
    var sum = 0
    for (n in numbers) {
        sum = sum + n
    }
    return sum
}
// call this function -> getSum(1,2,3,4,5,6,7) result is 28

//Function in function (local function)
fun printGreeting(firstName: String, lastName: String) {

    //Bắt đầu định nghĩa hàm cục bộ
    fun getFullName(firstName: String, lastName: String): String {
        return "$firstName - $lastName"
    }
    //Sử dụng hàm cục bộ
    println("Hello: ${getFullName(firstName, lastName)}")
}

