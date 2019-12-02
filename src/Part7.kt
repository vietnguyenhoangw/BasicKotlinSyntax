package part_7
/**
 * part 7
 * inheritance
 * docs: https://cungdev.com/ke-thua-trong-kotlin/#Dinh_nghia_ke_thua
 */

open class Animal(var kind : String, var name : String) {
    var age : Int ?= null
    var favorite: String? = null

    fun getInfo() {
        print("Hello, i am a $kind, my name is $name")
        age?.let {
            print(", i am $age years old")
        }
    }

    constructor(kind: String, name: String, age: Int) : this(kind, name) {
        this.age = age
    }

    constructor(kind: String, name: String, age: Int, favorite: String) : this(kind, name, age) {
        this.favorite = favorite
    }
}

class Cat(var color : String, kind : String, name : String) : Animal(kind, name) {

    fun getCatInfo() {
        super.getInfo()
        println(", my color is: $color")
    }

}