class funciones {
}

/*
fun perCirculo(){
    print("digite el radio de el circulo")
    var radio = readLine()!!.toInt()
    var per =2*3.14*radio
    println("el area de el circulo es "+per+"cm")
}
fun areaCirculo(){
    print("Digite el radio de circulo")
    var radio = readLine()!!.toInt()
    var area= 3.14*(radio*radio)
    println("al area de el circulo es "+area+"cm2")

}
fun areaTriangulo(base: Double,altura: Double){
    var area=(base * altura)/2
    println("el area de el triangulo es $area cm2")
}
fun perimetroTriangulo(l1:Double,l2:Double,l3:Double) {
    var perimetro= (l1+l2+l3)
    println("el perimetro de el triangulo es $perimetro cm")
    if(l1==l2 && l1==l3 %% l2==l3)(
            println("el triangulo es equilatero")
            )
    else if(l1!=l2 && l1!=l3 && l2!=l3){
        println("el triangulo es escaleno")
    }
    else if(l1==l2 && l2!=l3 && l1==l3 )
        println("el triangulo es isosceles")
}
fun tipotriangulo(l1:Double,l2:Double,l3:Double){


}*/
fun  areaRectangulo(l1:Double,l2:Double):Double{
    var area=l1*l2
    return area
}
fun perimetroRectangulo(l1:Double,l2:Double):Double{
    var per=2*(l1+l2)
    return per
}


fun main(){
    var i=1
    while(i==1){
        println("1. Calcular el Area del Rectangulo")
        println("2. Calcular el Perimetro del Rectangulo")
        println("Digite la opcion: ")
        var opcion = readLine()!!.toInt()
        if (opcion==1){
            println("digite la altura de el Rectangulo")
            var l1=readLine()!!.toDouble()
            println("digite la base de el Rectangulo")
            var l2=readLine()!!.toDouble()
            val areaC = areaRectangulo(l1,l2)
            println("El area de el Rectangulo es de $areaC cm2")
        }
        else if (opcion==2){
            println("digite la altura de el Rectangulo")
            var l1=readLine()!!.toDouble()
            println("digite la base de el Rectangulo")
            var l2=readLine()!!.toDouble()
            val perimetroC= perimetroRectangulo(l1,l2)
            println("El perimetro de el Rectangulo es de $perimetroC cm")
        }
        else {
            println("error")
        }
        println("Desea continuar? 1. para si 2. para no")
        i=readLine()!!.toInt()

    }

/*var i=1
while(i==1){
   println("1. Calcular el Area del triangulo")
   println("2. Calcular el Perimetro del triangulo")
   println("3. Tipo de triangulo")
   println("Digite la opcion: ")
   var opcion = readLine()!!.toInt()
   if (opcion==1){
       println("digite la base de el triangulo")
       var base = readLine()!!.toDouble()
       println("digite la altura de el triangulo")
       var altura = readLine()!!.toDouble()
       areaTriangulo(base,altura)
   }
   else if (opcion==2){
       println("Digite el lado 1")
       var l1 = readLine()!!.toDouble()
       println("Digite el lado 2")
       var l2 = readLine()!!.toDouble()
       println("Digite el lado 3")
       var l3 = readLine()!!.toDouble()
       perimetroTriangulo(l1,l2,l3)
   }
   else {
      println("error")
   }
   println("Desea continuar? 1. para si 2. para no")
   i=readLine()!!.toInt()*/

}

/*val temperatura=20
val isHot=if(temperatura>40) true else false
print(isHot)
print("digite su edad: ")
var edad= readLine()!!.toInt()
val isBig=if (edad>=18) println("Bienvenido") else println("pa la casa ")

print(isBig)
var i=1
while (i==1){
println("1. Calcular Perimetro")
println("2. Calcular Area")
println("Digite la opcion: ")
var opcion = readLine()!!.toInt()
if (opcion==1){
   println(perCirculo())
}
else if (opcion==2){
   println(areaCirculo())
}
else{
   println("error")
}
   println("Desea continuar? 1. para si 2. para no")
   i= readLine()!!.toInt()*/










