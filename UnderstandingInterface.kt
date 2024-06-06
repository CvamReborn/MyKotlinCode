interface Human{
    fun talk()
    fun walk()
}
interface Person{
    val name:String
    fun age(){
        println("age is 17")
    }
}
class Girl(override val name:String):Human,Person{
    override fun talk() {
        println("Girl talks in High pitch")
    }
    override fun walk() {
        println("Girl walks in cat style")
    }
}
class Boy():Human{
    override fun talk() {
        println("Boy talks in bold voice")
    }
    override fun walk() {
        println("Girl walks in men style")
    }
}
fun main() {
    val arr=arrayOf(Girl("Rani"),Boy())
    for(obj in arr){
        if(obj is Person) {
            obj.talk()
        }
        else{
            (obj as Human).talk()
        }
    }

}
