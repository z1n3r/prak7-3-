fun main(){
    print("Введите значение x1: ")
    var x1= readLine()!!.toDouble()
    print("Введите значение y1: ")
    var y1= readLine()!!.toDouble()
    print("Введите значение x2: ")
    var x2= readLine()!!.toDouble()
    print("Введите значение y2: ")
    var y2= readLine()!!.toDouble()
    print("Введите значение x3: ")
    var x3= readLine()!!.toDouble()
    print("Введите значение y3: ")
    var y3= readLine()!!.toDouble()

    val side1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))
    val side2=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2))
    val side3=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3))

    val perimetr=side1+side2+side3
    val semiperimetr=perimetr/2
    val area=Math.sqrt(semiperimetr*(semiperimetr-side1)*(semiperimetr-side2)*(semiperimetr-side3))
    val result=when{
        area.isNaN()->"Треугольника не существует"
        else->"Периметр треугольника: ${String.format("%.2f" , perimetr)},площадь треугольника:${String.format("%.2f" , area)}"

    }
    println(result)


}