import Colors.*

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
//    println("Java Exp: ${userJava.email}")
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
//    print("b1:$b1 b2:$b2 c1:$c1 b3:$b3")
    /**
     *function
     */
//    println("${myFirstFunction()}")
//    println("${myFirstFunction2(40)}")
//    println("${myFirstFunction3()}")
//
//    val result = myFirstFunction4(3, 4.2)
//    println(result)
    /**
     * Null pointer exception(NPE) & Null Safety
     */
//    val st: String
////  !!  - not null assert
//    st = getSt()!!
//
//    val size = st.length
//    print(st + " size " + size)
    /**
     * work with classes
     */
//    val person = Person("Alex", "Grebenko", 27)
//    println("${person.firstName} ${person.lastName} ${person.age}")
//
//    val car = Car(2.00050, 40)
//
//    car.isNew = true
    /**
     * package
     */
//    val catA = CatA()
//    catA.a1()
//    superMethod1()
    /**
     * enum
     */
//    val message: Colors = Colors.BLACK
//    var message2: String = Colors.GREEN.name
//
//    println("$message $message2")
//    println(Colors.WHITE.colorHex)
//    println("Color: ${Colors.WHITE} opacity: ${Colors.WHITE.opacity} Color: ${Colors.BLACK} opacity: ${Colors.BLACK.opacity}")
    /**
     * operator when (switch)
     */
//    var N = 1
//    var result = when (N) {
//        1 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        4 -> "Four"
//        else ->
//            "try again"
//    }
//    println(result)
//
//    println(getFavoriteColor(BLACK))
//
//    when (setOf(Colors.WHITE, Colors.GREEN)) {
//        setOf(Colors.BLACK, Colors.RED) -> println("черный-красный")
//        setOf(Colors.WHITE, Colors.GREEN) -> println("белый-зеленый")
//    }
//
//    var a = 2
//    var b = 4
//
//    when {
//        (a > b) -> println("$a > $b")
//        (a < b) -> println("$a < $b")
//        (a == b) -> println("$a == $b")
//        else -> println("else")
//    }
    /**
     * interface
     */
//    var v1: MyInterface = ClassA()
//    var v2: MyInterface = ClassB()
//
//    v1.func1()
//    v2.func1()
    /**
     * abstract class
     */
//    var v1: BaseTemplate = ATemplate()
//    v1.a()
//    v1.minus()
//    v1.a()
    /**
     * Modifier open, access modifier - private, public(like java package modifier),
     * protected(access only if class is extended), internal(use for different modules in project)
     */
//    val myPerson = MyPerson("Alex")
//    val driver = Driver("Alex")
//
//    println(myPerson.getAddress())
//    println(driver.getAddress())
//
//    val mouse = Mouse()
////    mouse.funA()
    /**
     * loops
     */
//    var index: Int = 0
//    while (index < 10) {
//        print("${index}")
//        index++
//    }
//
//    do {
//        print("${index}")
//        index++
//    } while (false)

    // array
//    var nums = 1..10

//    for (value in nums) {
//        print("$value")
//    }
//
//    // loop with step
//    for (value in nums step 2) {
//        print("$value ")
//    }
//
//    // loop revert
//    for (value in 10 downTo 1) {
//        print("$value ")
//    }
//
//    // loop revert
//    for (value in 10 downTo 1) {
//        print("$value ")
//    }
//
//    for (value in 10 downTo 1 step 3) {
//        print("$value ")
//    }
    /**
     * modifier IN
     */
//    var nums = 1..10
//
//    val value = 3
//    val characters = 'a'..'z'
//    for (num in nums) {
//        if (num == value) {
//            println(true)
//            break
//        }
//    }
//    short version loop over this code
//    println(value in nums)
//    println(isChar('z', characters))
    /**
     * POJO or data class
     */
//    val person = Dataclass("Alex", 27)
//    val person2 = person.copy(age = 2)
//    person.age = 25
//
//    println(person)
//    println(person2)
//
//    var (name, age) = person
//    println("Name=$name ,age=$age")
    /**
     * class Sealed
     */
    val e1 = Exp.Const(1.2)
    val e2 = Exp.Const(2.2)
    println(Exp.Sum(e1, e2))

    val sum = Exp.Sum(e1, e2)

    println(eval(sum))
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

fun getFavoriteColor(color: Colors) = when (color) {
    BLACK, WHITE -> "черный или белый"
    RED -> "красный"
    else -> "без цвета"
}

fun isChar(char: Char, characters: CharRange) = char in characters

fun eval(exp: Exp): Double = when (exp) {
    is Exp.Const -> exp.number
    is Exp.Sum -> eval(exp.e1) + eval(exp.e2)

    Exp.NotANumber -> Double.NaN
}
