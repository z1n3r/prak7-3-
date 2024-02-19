fun main(){
    print("Введите значение r1: ")
    var r1= readLine()!!.toDouble()
    print("Введите значение r2: ")
    var r2= readLine()!!.toDouble()

    val area=when{
        r1<0->{
            println("Внутренний радиус кольца не может быть отрицательным")
        }
        r1>=r2->{
            println("Внутренний радиус кольца должен быть меньше внешнего радиуса ")
        }
        else->{
            Math.PI*(r2*r2-r1*r1)
        }
    }
    println("Площадь кольца с внутренним радиусом $r1 и внешним радиусом $r2 равна: ${String.format("%.2f" , area)}")

}