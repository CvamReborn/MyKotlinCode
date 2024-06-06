fun main()
{
    var arr= arrayOf(1,2,2,2,3,5)
    print(removeDuplicateNumber(arr))
}
fun removeDuplicateNumber(arr: Array<Int>): List<Int> {
    val mySet= mutableSetOf<Int>()
    for(i in arr)
    {
        if(!mySet.contains(i)) mySet.add(i)
    }
    return mySet.toList()
}
