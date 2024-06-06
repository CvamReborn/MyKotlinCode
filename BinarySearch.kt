fun main() {
    println(binarySearch(intArrayOf(4,12),0,1,12))
}
fun binarySearch(arr:IntArray,start:Int,end:Int,key:Int):Boolean{
    if(start>end) return false;
    val mid=(start+end)/2
    if(arr[mid]==key) return true;
    if(key>arr[mid]) return binarySearch(arr,mid+1,end,key)
    else return binarySearch(arr,start,mid-1,key)
}