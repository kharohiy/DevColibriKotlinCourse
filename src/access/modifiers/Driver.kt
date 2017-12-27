package access.modifiers

class Driver(name: String) : MyPerson(name) {
    override fun getAddress(): String {
        return "Test2"
    }

    override fun toString(): String {
        return "Driver(name=$name age=$age)"
    }

    override val age: Int = 2
}

