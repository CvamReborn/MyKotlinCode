fun main() {
    print(isPerfectNumber(6))
}
fun isPerfectNumber(number:Int):Boolean{
    var sumOfFactors:Int=0
    for(i in 1..number/2) if(number%i==0) sumOfFactors+=i
    return sumOfFactors==number
}