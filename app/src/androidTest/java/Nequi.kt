class Nequi {
    var saldoDisponible: Double = 4500.0

    // Método para solicitar el número de celular y la clave de 4 dígitos
    fun login() {
        println("Registre su Numero")
        var phoneVer = readLine()
        println("Registre su clave de 4 digitos")
        var pinVer = readLine()

        println("Bienvenido a Nequi Colombia")
        for (i in 1..4) {
            print("Ingresa tu número de celular: ")
            var phoneNumber = readLine()
            print("Ingresa tu clave de 4 dígitos: ")
            var pin = readLine()

            if (phoneNumber == phoneVer && pin == pinVer) {
                println("¡Bienvenido! Acceso concedido.")
                showMenu()
                break
            } else {
                val remainingAttempts = 3 - i
                if (remainingAttempts > 0) {
                    println("¡Upps! Parece que tus datos de acceso no son correctos. Tienes $remainingAttempts intentos más.")
                } else {
                    println("Has agotado todos los intentos. La aplicación se cerrará.")


                }
            }
        }
    }

    // Método para mostrar el saldo disponible
    fun showBalance() {
        println("Tu saldo disponible es: $saldoDisponible")
    }

    // Método para realizar una transacción de retiro
    fun withdraw() {
        if (saldoDisponible < 2000) {
            println("No te alcanza para hacer el retiro.")
        } else {
            print("Ingresa la cantidad que deseas retirar: ")
            val amountToWithdraw = readLine()?.toDoubleOrNull()

            if (amountToWithdraw == null) {
                println("Cantidad inválida. Transacción cancelada.")
            } else if (amountToWithdraw > saldoDisponible) {
                println("El monto a retirar supera tu saldo disponible. Transacción cancelada.")
            } else {
                saldoDisponible -= amountToWithdraw
                val withdrawalCode = (100000..999999).random()
                println("Retiro exitoso. Código de retiro: $withdrawalCode")
            }
        }
    }

    // Método para realizar una transacción de envío de dinero
    fun sendMoney() {
        print("Ingresa el número de teléfono al que deseas enviar dinero: ")
        val recipientPhoneNumber = readLine()
        print("Ingresa el valor a enviar: ")
        val amountToSend = readLine()?.toDoubleOrNull()

        if (amountToSend == null) {
            println("Cantidad inválida. Transacción cancelada.")
        } else if (amountToSend > saldoDisponible) {
            println("No tienes suficiente saldo para realizar la transferencia.")
        } else {
            saldoDisponible -= amountToSend
            println("Transferencia exitosa. Se envió $amountToSend a $recipientPhoneNumber")
        }
    }

    // Método para realizar una transacción de recarga
    fun recharge() {
        print("Ingresa el valor a recargar: ")
        val rechargeAmount = readLine()?.toDoubleOrNull()

        if (rechargeAmount == null) {
            println("Cantidad inválida. Transacción cancelada.")
        } else {
            print("¿Estás seguro que deseas recargar $$rechargeAmount? (S/N): ")
            val confirm = readLine()

            if (confirm?.equals("S", ignoreCase = true) == true) {
                saldoDisponible += rechargeAmount
                println("Recarga exitosa. Saldo actual: $saldoDisponible")
            } else {
                println("Recarga cancelada.")
            }
        }
    }

    // Método para mostrar el menú de opciones
    fun showMenu() {
        var continueLoop = true

        while (continueLoop) {
            println("\n--- Menú de opciones ---")
            println("1. Ver saldo")
            println("2. Retirar dinero")
            println("3. Enviar dinero")
            println("4. Recargar saldo")
            println("5. Salir")

            print("Ingresa el número de opción que deseas realizar: ")
            when (readLine()) {
                "1" -> showBalance()
                "2" -> withdraw()
                "3" -> sendMoney()
                "4" -> recharge()
                "5" -> {
                    println("Gracias por usar Nequi. ¡Hasta luego!")
                    continueLoop = false
                }
                else -> println("Opción inválida. Por favor, ingresa una opción válida.")
            }
        }
    }

    // Método para iniciar la aplicación
    fun start() {

        login()

    }
}

fun main() {
    val nequi = Nequi()
    nequi.start()
}