fun main() {
    val arr=intArrayOf(3, 4, 5, 1, 2)
    println(arr.joinToString())
    cyclicSort(arr)
    println(arr.joinToString())
}
fun swap(arr:IntArray,first:Int,second:Int){
    val temp=arr[first]
    arr[first]=arr[second]
    arr[second]=temp
}
fun cyclicSort(arr:IntArray){
    var index=0
    while(index<arr.size){
        if(arr[index]==index+1) index++
        else swap(arr,index,arr[index]-1)
    }
}