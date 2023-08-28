object Q1001 extends App{
    def CelsiustoFahrenheit(celsius:List[Double]): List[Double] = {
        celsius.map((x: Double) =>  (x * 9/5) + 32)
    }

    def avg(fahrenheit:List[Double]): Double = {
        fahrenheit.reduce((x, y) => x + y)/fahrenheit.length;
    }

    val celsius = List(1,2,3,4,5.1852)
    val fahrenheit = CelsiustoFahrenheit(celsius)
    println(avg(fahrenheit))
}