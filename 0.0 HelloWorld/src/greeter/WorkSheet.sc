package greeter

object WorkSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val x = 5                                       //> x  : Int = 5
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 6
  val y = increase(x)                             //> y  : Int = 6
  increase(y)                                     //> res1: Int = 7
}