package Variables

object Compare {
  def main(args: Array[String]): Unit = {
    val A= List(7,6,5,3,2)
    val B= List(6,2,4,7)
    println("A: " + A)
    println("B: " + B)

    val intersection = A.intersect(B)

    println("""Intersection: """ + intersection)

    val C = List("one","two","three")
    val D = List("four","two","five")

    val StringIntersect = C.intersect(D)

    println("""String Intersection: """ + StringIntersect)

   // APPEND

    val x = new StringBuilder("who")

    val y = x.append(" am i?")
    val r1 = y.toString
    println(r1)

  }
}
