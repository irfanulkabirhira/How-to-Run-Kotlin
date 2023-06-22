fun main()
{
    for (hira in 1..8 ){
        println("step : $hira")
    }
    // but not possible to get reverse 
/* 
for (hira in 8..2){
    println("step : $hira")
}
 */
// to get reverse value ,i need to uee [in uperNumber downTo lowerNumber]
println()
for (hira in 8 downTo 1)
{
    println("step : $hira")
}

// print 1 to 10 odd numbers using for loop
println("Odd Numbers from 1 to 10:")
for (number in 1..10) {
    if (number % 2 != 0) {
        println(number)
    }
}
    
}