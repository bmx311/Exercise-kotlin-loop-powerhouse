package NumberPlayground

fun main(){
    countUpwards(5,10)
    countDownwards(9,4)

    val nums:IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("\nThe sum of all numbers in the array is: " + calculateSum(nums) + "\n")
    checkEvenOdd(5)

    println("\n5 factorial is " + calculateFactorial(5) + "\n")
}

//step 2
fun countUpwards(start: Int, end: Int){

    for(i in start..end){
        println(i)
    }
}

fun countDownwards(end: Int, start: Int){
    var i=end
    while (i in start..end){
        println(i)
        i = i.dec()
    }
}

//step 3
fun calculateSum(numbers: IntArray):Int{
    var sum=0
    for (i in numbers){
        sum +=i
    }
    return sum
}

//step 4
fun checkEvenOdd(numbers: Int){
    for (number in 1..numbers) {
        if (number % 2 == 0) {
            println("$number is even.")
        } else {
            println("$number is odd.")
        }
    }
}

//step 5
fun calculateFactorial(number: Int):Int{
    var result = number
        if (result > 1){
            result = result * (calculateFactorial(result-1))

        }
        else{
            return 1
        }
        return result
    }
