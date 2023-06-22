/*
 It's important to note that var is used for mutable variables,
  and if you want to declare an immutable (read-only) variable,
   you should use the val keyword instead.
  Immutable variables cannot be reassigned once initialized.
 */
fun main() {
    var age: Int = 23
    var name: String = "Irfanul Kabir Hira"
    var balance: Double = 1000.0

    println("Name: $name")
    println("Age: $age")
    println("Balance: $balance")

    println()
    
    age = 21
    name = "Tahrim Showkat Barsha"
    balance += 500.0

    println("Updated Name: $name")
    println("Updated Age: $age")
    println("Updated Balance: $balance")
}
