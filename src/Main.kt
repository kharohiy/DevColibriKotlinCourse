fun main(args: Array<String>) {
    /**
     * example of variables and symbol '$'
     */
//    var name: String = "Alex"
//
//    var a:Int = 1
//    var b:Int = 2
//
//    println("Hello Kotlin " + name)
//    println("Hello Kotlin $name")
//    println("Hello Kotlin \$name")
//    println("A + B = ${a+b}")


    /**
     * mutable and unmutable variables var and val
     */
//    val userJava = UserJava("test@email.com")
//    print("Java Example: ${userJava.email}")
//
//    val userKotlin = UserKotlin("test1@email.com")
//
//    print("Kotlin user; ${userKotlin.email}")
//
//    // mutable variable
//    var name: String = "asdf"
//    // unmutable
//    val name2: String = "qwer"
//
//    name = "poi"
//    name2 = "e"

    /**
     * data types
     */
//    var a0: String = "123"
//
//    var ab: Byte = 1
//    var a1: Short = 12//16
//    var a2: Int = 2 //32
//    var a3: Long = 43333 //64
//
//    var a4: Float = 2.4F//32
//    var a5: Double = 1.2e65//64
//
//    var b1: Long = a2.toLong()
//    var b2: String = ab.toString()
//
//    var c1: Char = 'a'
//
//    var b3 : Boolean = true
//
//    print("$b1 $b2 $c1 $b3")
    /**
     *function
     */
//    print("${myFirstFunction()} ${myFirstFunction2(40)} ${myFirstFunction3()}")
//
//    val result = myFirstFunction4(3,4.2)
//    println(result)

    /**
     * Null pointer exception(NPE) & Null Safety
     */
//    val st: String
//
//    !! not null assert
//    st = getSt()!!
//
//    val size = st.length
//    print(size)

    /**
     * work with classes
     */
//    val person = Person("Alex", "Grebenko", 27)
//    println("${person.firstName} ${person.lastName} ${person.age}")
//
//    val car = Car(2.00050, 40)
//
//    car.isNew = true
}


fun myFirstFunction(): Int {
    return 66
}

fun myFirstFunction2(a: Long): Int {
    return a.toInt()
}

fun myFirstFunction3() {
    print("myFirstFunction3")
}

fun myFirstFunction4(a: Long, b: Double) = a + b

// symbol ? return variable maybe null
fun getSt(): String? {
//    throw KotlinNullPointerException()
    return "hello"
}
