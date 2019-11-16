package part_2
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