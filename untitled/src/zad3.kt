fun main(){
    print("Введите длину окружности: ")
    var dlina= readLine()!!.toDouble()

    val radius=dlina/(2*Math.PI)
    val area= when(radius){
        0.0->0.0
        else-> Math.PI*radius*radius
    }
    println("Площадь круга: ${String.format("%.2f" , area)}")
}
