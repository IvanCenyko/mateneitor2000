interface prepareSpice {
    fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    var color: color
}

data class SpiceContainer(val spice: SimpleSpice) {
    val label: String = spice.name
}

enum class color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    YELLOW(0xFFFF00),
    BLUE(0x0000FF);
}

object YellowSpiceColor : SpiceColor {
    override var color: color = color.YELLOW
}

abstract class SimpleSpice(var name: String, var spiciness: String = "mild", color: SpiceColor) : prepareSpice {
    var heat: Int = 0
        get() {
            return when {
                spiciness == "mild" -> 4
                spiciness == "soft" -> 2
                spiciness == "spicy" -> 6
                spiciness == "hot" -> 8
                else -> 1
            }
        }

    init {
        println("Here you have some $name, one out of ten is a $heat spicy")
    }

    override fun prepareSpice() {
        // Implementation of prepareSpice function
    }
}

class curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) :
    SimpleSpice(name, spiciness, color), Grinder {

    val spiceColor: SpiceColor = color // Delegate to the color property in SpiceColor interface

    val spiceColorString: String
        get() = spiceColor.color.toString() // Access the color property through the delegate

    override fun grind() {
        // Implementation of grind function
    }

}

fun main() {
    createSpice("My curry")
}

fun createSpice(name: String) {
    val myCurry = curry(name, "spicy")
    val spiceContainer = SpiceContainer(myCurry)
    println(spiceContainer.label)
}