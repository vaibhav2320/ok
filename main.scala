scala c objname.scala

objname scala



import scala.io.StdIn
object cal{
def main(args:Array[String]): Unit={
println("Enter the two values: ")
val num1=StdIn.readInt()
val num2=StdIn.readInt()
def add(a:Int,b:Int):Int=a+b
println("Enter the choice (1)Addition,(2)Substraction,(3)Multiplication,(4)Division")
val choice=StdIn.readInt()
val result=choice match{
case 1=>add(num1,num2)
case 2=>num1-num2
case 3=>num1*num2
case 4=>num1.toDouble /num2.toDouble
}
println("The result is: "+result)
}
}
