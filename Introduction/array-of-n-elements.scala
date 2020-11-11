object Solution extends App {
    import scala.io.StdIn.readInt
    def f(num: Int): List[Int] = (1 to num).toList

    println(f(readInt))
}
