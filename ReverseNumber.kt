import kotlin.math.log10
import kotlin.math.pow

fun main() {
    print(reverseItUsingRecursion(125))
}
fun reverseIt(number:Int):Int
{
    var result=0
    var temp=number
    while(temp>0){
        result=result*10+(temp%10)
        temp /= 10
    }
    return result
}
fun reverseItUsingRecursion(number:Int):Int
{
    if(number<10) return number
    val noOfDigit=10.0.pow(log10(number.toDouble()).toInt()).toInt()
    return (number%10)*noOfDigit+reverseItUsingRecursion(number/10)
}