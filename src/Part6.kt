package part_6
/**
 * part 6
 * Class, properties and method
 * docs: https://cungdev.com/lop-thuoc-tinh-va-phuong-thuc/
 */

// this is empty class
// you can create the object from this class by using
// val human = Human()
class Human

// class with properties and method
class Human_2(var name : String, var age : Int) {
    fun introduce() {
        println("Hello, my name is $name, i'm $age years old")
    }

    fun greeting() {
        println("Nice to meet you $name")
    }

    // init will show log when a new object be created
    init {
        println("$name has been born")
    }
}

// secondary constructor
class Animal(var kind : String, var name : String) {
    var age : Int ?= null
    var favorite: String? = null

    fun getInfo() {
        print("Hello, i am a $kind, my name is $name")
        age?.let {
            print(", i am $age years old")
        }
    }

    // READ MORE IN SLIDE
    // 2 things need to note
    constructor(kind: String, name: String, age: Int) : this(kind, name) {
        this.age = age
    }

    // this second constructor must be reference to primary constructor
    // in this case
    // constructor3 -> constructor2 -> constructor1(primary constructor)
    // => constructor3 -> constructor1
    constructor(kind: String, name: String, age: Int, favorite: String) : this(kind, name, age) {
        this.favorite = favorite
    }

    // GETTER AND SETTER
    // read more in slide
    // but in kotlin getter and setter will be created by default
    // we need to avoid editting them
    var isSafe: Boolean
        get() {
            println("Getter of property isSafe called")
            if (kind.equals("tiger", true) || kind.equals("puma", true)) {
                return false
            } else {
                return true
            }
        }
        set(value) {
            println("Setter of property isSafe called")
        }
}

