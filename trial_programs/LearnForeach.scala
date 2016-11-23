/* Topic:  Learn different ways to use 'foreach'
 * Author: Sandeep Shukla
 * Date:   11/23/2016
 *
 * Description:
 * In this example we see different ways of accessing elements
 *
 */


object LearnForeach {
  def main(args: Array[String]): Unit = {
    val tempList = List("1", "2", "3");
    println("Sandeep")

    println("foreach different versions");
    println("version: 1")
    tempList foreach { s => println(s); }
    println("version: 2")
    tempList.foreach{ println }
    println("version: 3")
    tempList.foreach{ s => println(s); }
    println("version: 4")
    var sum = 0
    tempList.foreach(sum += (_).toInt)
    println(sum)
  }
}