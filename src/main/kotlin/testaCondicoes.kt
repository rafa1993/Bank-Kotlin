fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva.")
    } else if (saldo == 0.0) {
        println("Conta é neutra.")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}