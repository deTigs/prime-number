
fun main() {
    //Checks if a number is prime
    println("Enter number:")
    val number = readlnOrNull()?.toIntOrNull()
    var isPrime = true

    if (number is Int) {
        for (i in 2 until number) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
    }
    else {
        println("Please enter a valid integer")
    }

    val primeOrNot = if (isPrime) "$number is prime" else "$number not a prime number"
    println(primeOrNot)
}