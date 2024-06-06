open class Pimp{
    companion object Randi{
        var randiSex=0
        fun hello(){
            println("Hello World")
        }
    }
}
class Customer:Pimp(){

}

fun main(args: Array<String>) {
    val pimp=Pimp()
    Pimp.hello()
    Pimp.randiSex
    val customer=Customer()
}