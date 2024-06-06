fun main()
{
    val intArray= intArrayOf(5,4,3,2,1)
    bubbleSortUsingRecursion(intArray,intArray.size,0)
    print(intArray.joinToString())
}
fun bubbleSortUsingRecursion(arr:IntArray,outerIndex:Int,innerIndex:Int)
{
    if(outerIndex<0) return
    if(innerIndex<outerIndex-1)
    {
        if(arr[innerIndex]>arr[innerIndex+1])
        {
            val temp=arr[innerIndex]
            arr[innerIndex]=arr[innerIndex+1]
            arr[innerIndex+1]=temp
        }
        bubbleSortUsingRecursion(arr,outerIndex,innerIndex+1)
    }
    else
    {
        bubbleSortUsingRecursion(arr,outerIndex-1,0)
    }
}
fun bubbleSortUsingForLoop(intArray:IntArray)
{
    for(outerIndex in intArray.indices)
    {
        for(innerIndex in 0 until intArray.size-outerIndex-1)
        {
            if(intArray[innerIndex]>intArray[innerIndex+1])
            {
                val temp=intArray[innerIndex]
                intArray[innerIndex]=intArray[innerIndex+1]
                intArray[innerIndex+1]=temp
            }
        }
    }
}