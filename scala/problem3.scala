/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

import scala.math.sqrt

def isPrime(x: Int): Boolean = {
    (2 to sqrt(x).toInt).foreach((y: Int) => if (x % y == 0) return false)
    true
}

def primeFactors(x: Long): Array[Long] = {
    def go(counter: Long, y: Long): Array[Long] = {
        if (counter <= y) {
            if (isPrime(counter.toInt) && y % counter == 0)
                return Array(counter) ++ go(counter+1, y / counter)
            else
                go(counter+1, y)
        }
        else {
            return Array()
        }
    }
    go(2, x)
}

println(primeFactors(600851475143L).toList)
