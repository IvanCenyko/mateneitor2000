class SimpleSpice(var name: String, var spiciness: String = "mild") {
    var heat: Int = 0
        get(){
            return when{
                spiciness == "mild" -> 4
                spiciness == "soft" -> 2
                spiciness == "spicy" -> 6
                spiciness == "hot" -> 8
                else -> 1
            }
        }
    init{
        println("Here you have some ${this.name}, one ot ten its a ${this.heat} spicy")
    }
}
fun main(){
    makeSalt()
}
fun makeSalt(){
    val salt = SimpleSpice("salt", "soft")
}