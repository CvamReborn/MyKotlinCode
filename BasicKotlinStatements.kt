import java.util.*;
fun main()
{
    /**val (first,second,third)=Triple(10,9,12);
    if(first>second){
        if(first>third) print("$first is the largest number")
        else print("$third is the largest number")
    }
    else
    {
        if(second>third) print("$second is the largest number")
        else print("$third is the largest number")
    }
    val (first,second)=Pair(5,7)
    print("${first.coerceAtMost(second)} is the largest number")
    print(if(5>6) 5 else 6)**/

    /*val age=15
    val result=when(age)
    {
        in 1..17->"You can't vote"
        in 18..45->"You can vote"
        else->"Not valid"
    }
    print(result)*/

    val numbers=intArrayOf(1,2,3,4,5)
    //for(number in numbers) print("$number ")
    /*var index=0
    while(index<numbers.size)
    {
        print("${numbers[index]} ")
        index++
    }*/

    /*for(index in 0..numbers.size-1)
    {
        print(numbers[index])
        print(" ")
    }*/
    /*var i=5
    do{
        print(i)
        i++
    }while(i<5)
    i=5
    println()
    while(i<5){
        print(i)
        i++
    }*/
    /*var number=1..5
    print(number)*/
    //var intArray=IntArray(5)
    /*var intArray=Array<Int>(5){it*2}
    print(intArray.joinToString())
    println()
    val intObjArray= arrayOf(1,2,3)
    print(intObjArray.joinToString())*/
    val intArray=intArrayOf(1,1,2,3,3,4,5,2,5,6,4)//1122334556
    intArray.sort()
    var index=0
    var unique=-1
    while(index<intArray.size-1)
    {
        if(intArray[index]==intArray[index+1]) index += 1
        else {
            unique = intArray[index]
            break;
        }
        index++
    }
    if(unique==-1) unique=intArray[index]
    println(unique)
}