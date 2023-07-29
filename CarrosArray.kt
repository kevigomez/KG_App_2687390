class CarrosArray {
}

fun main(){
    var i:Int=1

    while (i==1) {
        var Auto = mutableListOf("")

        println("Digite 1 para registrar \n 2.para mostar los autos \n 3.Buscar auto \n 4. para modificar \n 5. para eliminar el auto")
        var a: Int = readLine()!!.toInt();
        if (a == 1) {
            println("Digite la marca del auto")
            var Car = readLine()
            val found = Auto.any { Car == it }
            if (found == true) {
                println("No pude registar un auto que ya existe")
            } else {
                Auto.add(Car.toString())
                println("Se registro el carro")

            }
        }
        if (a == 2) {
            print(Auto)
        }
        if (a == 3) {
            println("Digite el auto que desa buscar")
            var Car = readLine()
            val found = Auto.any { Car == it }
            if (found == true) {
                println("El auto $Car ya existe ")
            } else {
                Auto.add(Car.toString())
                println("El auto $Car no existe ")

            }


        }
        if (a == 4) {
            println("Digite la marca que desea modificar")
            val marca = readLine()
            val index = Auto.indexOfFirst { it == marca }
            if (index != 1) {
                print("Digita la nueva marca: ")
                val newmarca = readLine()
                Auto[index] = newmarca.toString()
                println("Se modifico exitosamente")
            }
        }
        if (a == 5) {
            println("Digite el auto que desea eliminar")
            val marca = readLine()
            val index = Auto.indexOfFirst { it == marca }
            if (index != 1) {
                Auto.removeAt(index)
                println("Se elimo exitosamente")
            }


        }
        if (a == 6) {
            Auto.clear()
            println("se elimo exitosamente")

        }
        println("Desa hacer otro proceso")
        print("Desea ejecutar otra vez 1-si, 2-no")
        i = readLine()!!.toInt()
    }}