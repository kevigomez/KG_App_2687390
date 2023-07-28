class reto1 {
}
fun main(){
    var given1=(1..6).random();
    var given2=(1..6).random();
    var plus=(given1+given2);

    print("Bienvenido este es un juego de craps")
    print("ganas si: Hay un par de unos en los dados")
    print("Hay un total de 3 en los dados")
    print("Hay un total de 11 en los dados")
    print("si el total de los dados da 2 o 12")
    print("Hay u total de 7 en los dados")

    if(given1==1 && given2==1 || plus==3 || plus==11 || plus==2 && plus==12 || plus==7){
        print("Gano")
    }
    else {
        print("Perdio")
    }
}