fun main()
{
    val input= readln().toInt()
    val array= IntArray(input)
    for(eachIndex in array.indices)
        array[eachIndex]=readln().toInt()

    val map= mutableMapOf<Int,Int>()
    for(item in array)
        map[item] = map.getOrDefault(item,0)+1
    var max=Int.MIN_VALUE
    for(item in map.keys)
    {
        if(max== Int.MIN_VALUE)
            max= map[item]!!
        else
            max=Math.max(max,map[item]!!)
    }
    print(max)

}