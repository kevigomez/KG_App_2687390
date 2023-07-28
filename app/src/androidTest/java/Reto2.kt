class Reto2 {
}
fun main(){
    var given=(1..4).random()
    print("Digite el Valor de su compra: ")
    var valCompra = readLine()!!.toInt();
    if(valCompra >= 50000)
        when(given){
                1 -> {println("sacaste la bolita roja");
                var desc=(valCompra*10)/100;
                var total=valCompra-desc;
                println("entonces el total de su compra es $total")}
                2 -> {
                    println("scaste la bolita azul")
                var desc=(valCompra*30)/100;
                var total=valCompra-desc;
                println("entonces el total de su compra es $total")}
                3 -> {print("sacaste la bolita amarilla");
                var desc=(valCompra*50)/100;
                var total=valCompra-desc;
                println("entonces el total de su compra es $total")}
                4 -> {print("sacaste la bolita blanca");
                 println("Entonces su compra es gratis")}
        }
    else{
        println("no tiene descuento")
    }
}