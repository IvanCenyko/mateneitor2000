import java.util.*
fun main(){
    semana()
}
fun semana(){
    println("Que dia es hoy?")
    val dia = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (dia) {
        1 -> "Domingo"
        2 -> "Lunes"
        3 -> "Martes"
        4 -> "Miercoles"
        5 -> "Jueves"
        6 -> "Viernes"
        7 -> "Sabado"
        else -> "GGWP hora de suicidarse no funciona esto"
    }
    )
}