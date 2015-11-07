/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

def divisibleBy(testNum: Int, divisBy: Int): Boolean =
    if (testNum % divisBy == 0) true else false

println((0 to 999).toList.filter((x : Int) => divisibleBy(x, 3) || divisibleBy(x, 5)).foldLeft(0)(_ + _))
