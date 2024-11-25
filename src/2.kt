import java.util.*
fun main() {
    var lector: Scanner = Scanner(System.`in`)
    var num1: Int = lector.nextInt()
    var num2:Int = lector.nextInt()
    var comparacion = comparacionNums(num1,num2)

    println("El número uno es mayor que el número 2? $comparacion")

}

fun comparacionNums(num1: Int, num2: Int): Boolean{
    var numEsMayor: Boolean

    if(num1>num2){
        numEsMayor= true
    }else{
        numEsMayor= false
    }
    return numEsMayor

}