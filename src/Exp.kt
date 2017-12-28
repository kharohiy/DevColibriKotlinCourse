sealed class Exp {
    class Const(val number: Double) : Exp()
    class Sum(val e1: Exp, val e2: Exp): Exp()
    object NotANumber : Exp()
}