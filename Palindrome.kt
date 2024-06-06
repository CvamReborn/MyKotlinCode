fun main() {
    print(isPalindromeUsingLoop("tenett"))
}
fun isPalindrome(word:String):Boolean
{
    return word.reversed()==word
}
fun isPalindromeUsingLoop(word:String):Boolean{
    var start=0
    var end=word.length-1
    while(start<end)
    {
        if(word[start]!=word[end]) return false
        start++
        end--
    }
    return true
}