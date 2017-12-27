package interfaces

class ClassA : MyInterface {
    override fun func1() {
        println("ClassA")
    }

    override fun func2() {
        super.func2()
    }
}
