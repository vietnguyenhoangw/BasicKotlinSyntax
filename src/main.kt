fun main() {
    // call function name here:
    nonnull_type()
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