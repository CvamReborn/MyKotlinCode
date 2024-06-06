import java.util.*

fun main() {
    val result=::powerCalc
    print(sumOfPowerOfArrayElement(arrayOf(1,2,3,4),result))
}
fun sumOfPowerOfArrayElement(arr:Array<Int>,power:(Int,Int)->Int):Int{
    var answer=0
    for(values in arr){
        answer+=power(values,2)
    }
    return answer
}
fun powerCalc(number:Int,exp:Int):Int{
    if(exp==0) return 1
    return number*powerCalc(number,exp-1)
}