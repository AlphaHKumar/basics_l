import java.util.Scanner
import kotlin.math.pow

fun main() {
/*
    Date : 13 - 03 - 2022
    println("1")
    println("2")
    println("3")
    println("4")
    println("5")
    println("6")
    println("7")
    println("8")
    println("9")
    println("10")

    for (i in 1..10) print(i)
    println()
    for (i in 1..10) println(i)

    val endRange = Integer.valueOf(readLine())
    for (i in 1..endRange) {
        println(i)
    }

    val inputTaker = Scanner(System.`in`)

    for (i in 1..endRange) println(i)
    val floatNumber = inputTaker.nextFloat()
    println(floatNumber)

    for(i in 10 downTo 1) println(i)
    for(i in endRange downTo 1) println(i)

    var sum = 0
    for (i in endRange downTo 1) {
        sum += i
        println(sum)
    }
    sum = 0
    for (i in 1..endRange) {
        sum += i
        println(sum)
    }

    for (i in 1..endRange) {
        println(i*i)
    }
    for (i in 1..endRange) {
        println(i*i*i)
        println(i.toDouble().pow(3.0))
    }

    for (i in 0..endRange step 2){
        println(i)
    }

    var sumEven = 0
    for (i in 1..endRange) {
        if (i%2==0) {
            println(i)
            sumEven += i
        }
    }
    println(sumEven)

    sumEven = 0
    var count = 0
    var i = 1
    do {
        if (i%2==0) {
            println(i)
            sumEven += i
            count += 1
        }
        i+=1
    }while (count < endRange)
    print("The total sum of first $endRange even numbers is $sumEven") */

    /*
    Date : 14 - 03 - 2022
    */

    val inputTaker = Scanner(System.`in`)
    val enteredValue = inputTaker.nextInt()
    var k = enteredValue
    var sum = 0
    var rem = 0
    while(k>0){
        rem = k % 10
        sum += rem
        k /= 10
    }
    println("Sum of the number you entered is $sum")
    var prod = 1
    rem = 0
    k = enteredValue
    while(k>0){
        rem = k % 10
        prod *= rem
        k /= 10
    }
    println("Product of the number you entered is $prod")

}