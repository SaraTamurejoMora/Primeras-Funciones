import java.util.*
fun main(){
    var lector: Scanner = Scanner(System.`in`)
    var num: Int = lector.nextInt()
    var resultadoCuadrado: Int = cuadrado(num)
    println("El cuadrado del número $num es $resultadoCuadrado")

}

fun cuadrado(num:Int): Int{
    var numCuadrado: Int

    numCuadrado = num * num
    return numCuadrado
}