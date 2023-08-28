object Q1002 extends App{
    def  countletter(str: List[String]): Int = {
        str.map(_.length()).reduce((x, y) => x + y)
    }

    val str = List("apple", "banana", "cherry", "date")
    println(countletter(str))
}