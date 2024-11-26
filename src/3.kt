import java.util.*
import kotlin.math.PI
import kotlin.math.pow

fun main() {
    var lector: Scanner = Scanner(System.`in`)
    var menu: String = """
    -----------------------------
                Menú
    -----------------------------
        1.Calcular volumen esfera
        2.Calcular área cuadrado
        3.Calcular área rectangulo
        4.Calcular área triangulo
        5.Salir
        
    """.trimIndent()
    var opcionUsuario: Int = 0
    var opcionUsuarioValida: Boolean = false

    var radio: Float = lector.nextFloat()
    var volumenEsfera = volumen(radio)


    do{
        do{
            println("Hola! Qué quieres hacer?")
            println(menu)
            opcionUsuarioValida = lector.hasNextInt()
            if(opcionUsuarioValida == true){
                opcionUsuario = lector.nextInt()
                if(opcionUsuario >= 1 && opcionUsuario <= 5){
                    println("Has escogido la opción $opcionUsuario")
                }else{
                    println("La opción ha de ser entre 1 y 5")
                    opcionUsuarioValida = false
                }
            }else{
                println("Ha de ser un número")
            }

        }while(opcionUsuarioValida == false)



    }while(opcionUsuario !=5)

    println("La esfera con el radio $radio tiene un volumen de $volumenEsfera")
}


fun volumen(radio: Float): Float{
    var calculoVolumen: Float
    calculoVolumen = (4/3.toFloat() * PI * radio.pow(3)).toFloat()
    return calculoVolumen

}
