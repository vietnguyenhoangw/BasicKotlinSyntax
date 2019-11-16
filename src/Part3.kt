package part_3
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
