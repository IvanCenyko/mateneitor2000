fun main(){
    println(addFish(10.0,listOf(3,3,3)).toString())
    println(addFish(8.0,listOf(2,2,2),hasDecoration = false).toString())
    println(addFish(9.0,listOf(1,1,3),3).toString())
    println(addFish(10.0,listOf(),7,true).toString())
}

fun addFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecoration: Boolean = true): Boolean{
    var totalFish = 0
    val realTankSize = if (hasDecoration == true) tankSize*0.8 else tankSize
    for (element in currentFish) totalFish += element
    println("$realTankSize, $totalFish")
    return if ((totalFish + fishSize)>realTankSize) false else true
}