fun main()
{
    val intArray= intArrayOf(5,3,4,2,1)
    println(intArray.joinToString())
    selectionSortUsingRecursion(intArray,0,0)
    println(intArray.joinToString())
}
fun selectionSortUsingIteration(arr:IntArray)
{
    for(i in arr.indices){
        var smallIndex=i
        for(j in i until arr.size)
        {
            if(arr[smallIndex]>arr[j]) smallIndex=j
        }
        val temp=arr[i]
        arr[i]=arr[smallIndex]
        arr[smallIndex]=temp
    }
}
var globalSmallIndex=0
fun selectionSortUsingRecursion(arr:IntArray, outerIndex:Int, innerIndex:Int)
{
    if(outerIndex==arr.size) return
    if(innerIndex==arr.size)
    {
        val temp=arr[globalSmallIndex]
        arr[globalSmallIndex]=arr[outerIndex]
        arr[outerIndex]=temp
        return
    }
    if(arr[globalSmallIndex]>arr[innerIndex]) globalSmallIndex=innerIndex
    selectionSortUsingRecursion(arr,outerIndex,innerIndex+1)
    globalSmallIndex=outerIndex+1
    selectionSortUsingRecursion(arr,outerIndex+1,outerIndex+1)
}