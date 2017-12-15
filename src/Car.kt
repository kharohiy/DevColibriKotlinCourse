class Car(private var weight: Double, private var size: Int) {

    var isNew: Boolean = false
        get() {
            return weight > size
        }
        set(value) {
            if (value) {
                print("Yes")
            }
            field = value
        }
}