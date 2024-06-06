fun main()
{
    println(factorialByIteration(5))
    print(factorialByRecursion(5))
}
fun factorialByIteration(number:Int):Int
{
    var result=1
    for(i in 1..number) result=result*i
    return result
}
fun factorialByRecursion(number:Int):Int
{
    if(number==0) return 1
    return number*factorialByRecursion(number-1)
}

