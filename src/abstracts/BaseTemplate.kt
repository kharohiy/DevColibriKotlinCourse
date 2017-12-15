package abstracts

open abstract class BaseTemplate {

    var count = 1
    fun a() {
        println("count " + count++)
    }

    abstract  fun minus()
}