import java.util.*

fun main() {
    var intArray=intArrayOf(5,4,3,2,1)
    println(intArray.joinToString())
    intArray=mergeSort(intArray)
    print(intArray.joinToString())
}
fun mergeSort(arr:IntArray):IntArray{
    if(arr.size==1) return arr
    val mid=arr.size/2
    val left:IntArray=mergeSort(Arrays.copyOfRange(arr,0,mid))
    val right:IntArray=mergeSort(Arrays.copyOfRange(arr,mid,arr.size))
    return merge(left,right)
}
fun merge(left:IntArray,right:IntArray):IntArray {
    val mix=IntArray(left.size+right.size)
    var i=0
    var j=0
    var m=0
    while(i<left.size && j<right.size)
    {
        if(left[i]<right[j])
        {
            mix[m]=left[i]
            i++
        }
        else{
            mix[m]=right[j]
            j++
        }
        m++
    }
    while(i<left.size)
    {
        mix[m]=left[i]
        i++
        m++
    }
    while(j<right.size){
        mix[m]=right[j]
        j++
        m++
    }
    return mix
}