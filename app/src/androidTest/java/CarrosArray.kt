class CarrosArray {
}

fun main(){
    var i=1
    var Autos = mutableListOf("")
    while (i==1) {

        println("Seleccione 1. para registrar 2. mostrar los autos 3. buscar el auto 4. modificar el auto 5. elminar el auto y 6. eliminar la lista completa ")
        var opcion = readLine()!!.toInt();

        when (opcion) {
            1 -> {
                println("Digite el auto que desea registrar")
                var carro=  readLine()
                val found = Autos.any { carro == it }
                if(found==true){
                    println("no se puede registrar porque ya existe")
                }
                else{
                    Autos.add(carro.toString())
                    println("Se registro el carro")
                }
            }
            2 ->{
                println(Autos)
            }
            3->{
                println("Digite el auto que desa buscar")
                var carro=  readLine()
                val found = Autos.any { carro == it }
                if(found==true){
                    println("El auto $carro ya existe ")
                }
                else{
                    Autos.add(carro.toString())
                    println("El auto $carro no existe ")
                }
            }
            4->{
                println("digite el que desea modificar")
                var carrmod= readLine()
                var posicion=Autos.indexOfFirst { it == carrmod }
                if(posicion != 1){


                }
            }
        }
    }
}