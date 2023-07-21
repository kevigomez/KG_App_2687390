class Arrays {
}
fun main(){
    val pets= arrayOf("dog","cat","canary")
    println(pets.contentToString())
    for(element in pets){
        println("la mascota es $element")
    }
    var instruments= mutableListOf("Trumpet","piano","violin")
        val instrumentos: List<String> =listOf("Trumpet","piano","violin")
    println(instruments)
    println(instrumentos)
    instruments[1]=("guitarra")

    //primero
    println("Primero: ${instruments.first()}")
    //ultimo
    println("Ultimo: ${instruments.last()}")
    //agregar elemento
    instruments.add("organeta")
    println(instruments)
    //quitar
    instruments.remove("organeta");
    //que paasa si quitas un elemento que no existe?= mostrara falso y no se hara modificacion
    //quitar a traves de index
    instruments.removeAt(2)
    instruments.clear()


}