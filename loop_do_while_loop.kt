fun main() {
    var hira = 1

    do {
        println("step : $hira")
        hira++
    } while (hira <= 8)
println()
    // to reverse the loop 
    var jira = 8

    do {
        println("step : $jira")
        jira--
    } while (jira >= 1)
// print 1 to 10 odd numbers using for loop

    println("Odd Numbers from 1 to 10:")
    var number = 1

    do {
        if (number % 2 != 0) {
            println(number)
        }
        number++
    } while (number <= 10)
}


