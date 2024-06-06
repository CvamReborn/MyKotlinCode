fun main() {
    print(isAnagram("ram","mar"))
}
fun isAnagram(first:String,second:String):Boolean{
    val map1=HashMap<Char,Int>()
    val map2=HashMap<Char,Int>()
    for(ch in first) map1[ch] = map1.getOrDefault(ch,0)+1
    for(ch in second) map2[ch] = map2.getOrDefault(ch,0)+1
    return map1 == map2
}