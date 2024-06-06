class Staff{
    lateinit var name: String
    fun initialize(name:String){this.name=name}


    companion object Principal{
        @JvmStatic
        fun sayHello(){print("Hello Principal")}
    }
    object Teacher{
        @JvmStatic
        fun sayHello(){print("Hello Teacher") }
    }
    class Student{
        fun sayHello(){print("Hello Student")}
    }
}
fun main(args: Array<String>) {
    val student = Staff.Student()
    student.sayHello()
    Staff.sayHello()


    val staff=Staff()
    staff.initialize("ram")
    println(staff.name)

}