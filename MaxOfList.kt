fun main()
{
    val numberList= arrayListOf<Int>()
    for(eachIndex in 1..5)
        numberList.add(readln().toInt())
    print(maxofList(numberList))
}
fun maxofList(numberList:ArrayList<Int>):Int
{
    var large=numberList[0]
    for(eachIndex in numberList.indices)
    {
        large=Math.max(large,numberList[eachIndex])
    }
    return large
}
