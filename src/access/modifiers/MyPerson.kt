package access.modifiers

open class MyPerson(val name: String) {
    open val age: Int = 29

    open fun getAddress(): String {
        return "Test"
    }

    override fun toString(): String {
        return "MyPerson(name='$name')"
    }
}