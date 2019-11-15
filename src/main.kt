fun main() {
    // call function name here:
    break_and_continue()
}

/*
* part 1
* data type, var, array
* */

fun var_and_val() {
    var name = "daniel"
    var age = 21
    var is_gay = false
    val national = "vietnam"

    print("name: " + name +
            "\nage: " + age +
            "\nis gay: " + is_gay)
    print("\n" + national)

    print("change variable's value: \n")
    name = "trang nhung"
    age = 19
    is_gay = true
    //national = "laocais"

    print(name + " - " + age + " - " + is_gay)
}

fun basic_datatype() {
    var var_int = 100
    var var_long = 4L
    var var_float = 55.55F
    var var_double = 55.55

    print("int: " + var_int +
    "\nlong: " + var_long +
    "\nfloat: " + var_float +
    "\ndouble: " + var_double)
}

fun convert_datatype() {
    var my_int = 100
    var double = my_int.toDouble()
    var long = my_int.toLong()
    var float = my_int.toFloat()
    var byte = my_int.toByte()
    var string = my_int.toString()

    print("int: " + my_int +
    "\ndouble: " + double +
    "\nlong: " + long +
    "\nfloat: " + float +
    "\nbyte: " + byte +
    "\nstring: " + string)
}

fun boolean_datatype() {
    val myTrue = true
    val myFalse = false

    val a = 1
    val b = 3
    val c = 4
    val d = 6

    val result = a < b && d > c

    print(result)
}

fun string_datatype() {
    var name = "Viet Nguyen Hoang"
    var string = "first line \nsecond line \n3rd line"

    println(name)
    println(string)

    var text = """ name: Viet Nguyen Hoang
        | age: 20
        | job: student
    """.trimMargin()

    println("\n" + text)

    //string template
    var dd = 31
    var mm = 12
    var yyyy = 1998

    var info = "Nguyen Hoang Viet, birth: $dd/$mm/$yyyy"

    print("\n" + info)

    var math = "31 + 12 = ${31 + 12}"

    print("\n" + math + "\tlenght: " + math.length)
}

fun array_datatype() {
    // array 1
    val firstArray = arrayOf(1, 2, 3, 4, 5)

    for (item in firstArray) {
        println(item)
    }

    println("size: " + firstArray.size)

    //array 2
    val stringArray = arrayOf("blue", "red", "green")

    println("get index: 0 = " + stringArray[0] + ", 2 = " + stringArray[2] + "\n")

    //array 3
    val testcaseArray = arrayOf("daniel", 2, 5, "kaka")

    for (item in testcaseArray) {
        println(item)
    }

    if (testcaseArray[0] is String)
        println("daniel is String: true")
    else
        println("daniel is String: false")

    if (testcaseArray[2] is Int)
        println("5 is Int: true")
    else
        println("5 is Int: false")

    //array 4
    val floatArray = arrayOf<Float>(2.1f, 2.2f, 2.3f, 2.4f)
    val doubleArray = doubleArrayOf(2.1, 2.2, 2.3, 2.4)

    println()
    for (item in floatArray) {
        println("float: " + item)
    }

    println()
    for (item in doubleArray) {
        println("double: " + item)
    }
}

fun comment() {
    /*
    * this is a multiple line comment
    * line 1
    * line 2
    * */

    // single line comment
}

/**
 * part 2
 * null safety
 * docs: https://cungdev.com/kiem-tra-bien-null-kotlin/
 */

fun nonnull_type() {
    var name : String = "daniel"

    // name = null -> var's data type in part 1 is not null value

    var name2 : String? = null

    // add '?' symbol if you want var is null

    /* safe call
    * */
    var name3 : String? = "hello world"
    var lengthOfname = name3?.length

    println("length: $lengthOfname")

    // another case to check var null
    // name2 = null ? skip : excute the command
    name2?.let {
        var length = name2.length
        println("name2.length = $length")
    }

    // If the expression is on the left '?:' symbol is not null
    //       length's value will be name3.length
    // else
    //       length's value = -1
    val length = name3?.length ?: -1

    println("last length: $length")
}

/**
 * part 3
 * loop and condition
 * docs: https://cungdev.com/vong-lap-va-dieu-kien-kotlin/
 */

// IF - ELSE
fun if_and_ifelse() {
    // if and if else struct is the same with java

    val age = 20

    if (age > 18) {
        println("20 is adult")
    }

    val a = 10
    val b = 20

    if (a > b) {
        println("$a > $b")
    }
    else if (a == b) {
        println("$a = $b")
    }
    else {
        println("$a < $b")
    }

    // if can assign the value for var
    val firstNumber = 10
    val secondNumber = 25
    var max = if (firstNumber>secondNumber) {
        println("$firstNumber is max")
        firstNumber
    }
    else {
        println("$secondNumber is max")
        secondNumber
    }
    println("Max = $max")
}

fun when_struct() {
    // when in Kotlin like switch-case struct in java

    val age = 19

    when (age){
        in 1..17 -> { print("Child") }
        in 18..40 -> { print("Adult") }
        else -> { print("Old") }
    }
    println()

    // another ex
    var numberOne = 19
    var numberTwo = 21

    when(numberOne){
        numberTwo/2 -> println("$numberOne = $numberTwo /2")
        else -> print("$numberOne != $numberTwo /2")
    }
}

// LOOP

fun while_loop() {
    // similar with java
    var age = 1

    while (age < 100) {
        println("Now i am $age years old")
        age ++
    }

    println("RIP!")
}

fun do_while_loop() {
    var age = 1

    do {
        println("Now i am $age years old")
        age ++
    } while (age <= 100)

    println("RIP!")
}

fun for_loop() {

    println("Display 1 to 5:")
    for (i in 1..5) {
        print("$i ")
    }

    println("\nDisplay 1 to 5, skip 2 index:")
    for (i in 1..5 step 2) {
        print("$i ")
    }

    println("\nDisplay 5 to 1:")
    for (i in 5 downTo 1) {
        print("$i ")
    }

    println("\nDisplay 5 to 1, skip 2 index:")
    for (i in 5 downTo 1 step 2) {
        print("$i ")
    }

    println("\nLoop with array:")
    val listOfNumber = listOf<Int>(1, 2, 3, 4, 5, 6)
    for (number in listOfNumber){
        if(number%2==0){
            println("$number is even number")
        }else{
            println("$number is odd number")
        }
    }

    println("\nDisplay list player name with start character is R:")
    val listName = arrayOf("Neymar", "Vidal", "Rooney", "Ronaldo", "Messi", "Bale")
    for (name in listName) {
        if (name.startsWith("R")) {
            println(name)
        }
    }

    println("\nReverse array:")
    for (name in (listName.size - 1) downTo  0) {
        print(listName.get(name) + "\t")
    }

    val listNumber = listOf<Int>(1, 3, 2, -1, 4, 6, 7)
    var sum = 0

    print("\n\nSummary of list 1, 3, 2, -1, 4, 6, 7:\t")
    for (index in 0..listNumber.size - 1) {
        sum += listNumber.get(index)
    }
    println(sum)
}

// BREAK AND CONTINUE

fun break_and_continue() {
    // similar 100% java struct
    println("Break:\n")
    for(age in 1..100){
        println("Now i am $age years old")
        if(age == 25){
            println("i see girl when ride motorbike, then i hug a big tree in the road")
            break
        }
    }
    print("RIP!")

    println("\n\nContinue:\n")
    var level = 1
    while (level <= 10) {
        if (level == 3) {
            level += 6
            println("I have a special gift code, my level up!!!")
            continue
        }
        println("My level is $level")
        level++
    }

}