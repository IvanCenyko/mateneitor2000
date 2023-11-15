fun main(){
    val fortuna = fortuna()
    print("Tu fortuna es: $fortuna")
}

fun fortuna(): String{
    val lista: List<String> = listOf("sexo","follar","coito","reproduccion","metesaca","intimidad","mucho sexo")
    print("cuando cumplis mi pana? ")
    var cumple = 14
    return lista[cumple/7]

}