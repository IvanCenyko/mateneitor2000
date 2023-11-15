fun main(){
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String{
    return when {
        mood == "happy" && weather == "sunny" && temperature > 16 -> "Outdoor sex"
        mood == "happy" && weather == "sunny" && temperature < 16 -> "Baranda sex"
        mood == "happy" && weather == "rainy" && temperature > 16 -> "Against window sex"
        mood == "happy" && weather == "rainy" && temperature < 16 -> "Cuddling in bed sex"
        mood == "happy" && weather == "cloudy" && temperature > 16 -> "Anal sex"
        mood == "happy" && weather == "cloudy" && temperature < 16 -> "BDSM sex"
        mood == "sad" && weather == "sunny" && temperature > 16 -> "Creampie sex"
        mood == "sad" && weather == "sunny" && temperature < 16 -> "Advancing on Cum Jar"
        mood == "sad" && weather == "rainy" && temperature > 16 -> "Paja triste"
        mood == "sad" && weather == "rainy" && temperature < 16 -> "Cumming on walls"
        mood == "sad" && weather == "cloudy" && temperature > 16 -> "Jerking to JOI porn"
        mood == "sad" && weather == "cloudy" && temperature < 16 -> "Crying till you cum on your chest"
        mood == "neutral" && weather == "sunny" && temperature > 16 -> "Roulette Jerk off"
        mood == "neutral" && weather == "sunny" && temperature < 16 -> "Edging"
        mood == "neutral" && weather == "rainy" && temperature > 16 -> "CBT porn"
        mood == "neutral" && weather == "rainy" && temperature < 16 -> "Mommy play"
        mood == "neutral" && weather == "cloudy" && temperature > 16 -> "Pet play"
        mood == "neutral" && weather == "cloudy" && temperature < 16 -> "Urethra insertion play"
        else -> "Jerking off to hentai"
    }
}