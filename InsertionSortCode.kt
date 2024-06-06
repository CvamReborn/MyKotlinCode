fun main()
{
    val arr= intArrayOf(5,4,3,2,1)
    insertionSortUsingRecursion(arr,0,0)
    print(arr.joinToString())
}
fun insertionSortUsingRecursion(arr:IntArray,outerIndex:Int,innerIndex:Int)
{
    if(outerIndex==arr.size) return
    if(innerIndex==0)
    {
        insertionSortUsingRecursion(arr,outerIndex+1,outerIndex+1)
    }
    else
    {
        if(arr[innerIndex]<arr[innerIndex-1])
        {
            val temp=arr[innerIndex]
            arr[innerIndex]=arr[innerIndex-1]
            arr[innerIndex-1]=temp
        }
        insertionSortUsingRecursion(arr,outerIndex,innerIndex-1)
    }
}
fun insertionSortUsingLoop(arr:IntArray){
    for(outerIndex in 1 until arr.size)
    {
        var innerIndex=outerIndex
        while(innerIndex>0)
        {
            if(arr[innerIndex]<arr[innerIndex-1])
            {
                val temp=arr[innerIndex]
                arr[innerIndex]=arr[innerIndex-1]
                arr[innerIndex-1]=temp
            }
            else break
            innerIndex--
        }
    }
}