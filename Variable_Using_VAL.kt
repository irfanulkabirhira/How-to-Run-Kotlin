/* 
n Kotlin, the val keyword is used to declare immutable variables.
 Once assigned, the value of a val variable cannot be changed.
 */
fun main() {
    val age: Int = 23
    val name: String = "Irfanul Kabir Hira"
    val balance: Double = 1000.0

    println("Name: $name")
    println("Age: $age")
    println("Balance: $balance")

    // Uncommenting the following lines will result in a compilation error
    // age = 31
    // name = "Tahrim showkat Barsha"
    // balance += 500.0
     println()
    println("Name: $name")
    println("Age: $age")
    println("Balance: $balance")
}
