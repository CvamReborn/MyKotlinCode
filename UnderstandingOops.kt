import kotlin.math.pow

open class Shape(val length:Int, val width:Int){
    constructor() : this(1,1)
    open fun area(){
        println("Area of the shape ${this.javaClass}")
    }
}
class Square():Shape(){
    override fun area(){
        print("Area of the square is ${this.length.toDouble().pow(2)}")
    }
}
class Rectangle(length:Int,width:Int):Shape(length,width){
    override fun area(){
        print("Area of Rectangle is ${this.length*this.width}")
    }
}
class Cuboid(length:Int, width:Int, private val height:Int):Shape(length,width){
    fun volume(){
        print("Volume of cuboid is ${this.length*this.width*this.height}")
    }
    override fun toString():String{
        return "Cuboid={Length: $length, Width: $width, Height: $height}"
    }
}
fun main(){
    val cuboid=Cuboid(5,6,7)
    cuboid.volume()
    println(cuboid)
}