fun main() {
    println("Bem vindo ao Bytebank")

    val contaRafaela = Conta(titular = "Rafaela", numero = 1000)
    contaRafaela.deposita(200.0)

    val contaFran = Conta(titular = "Fran", numero = 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaRafaela.titular)
    println(contaRafaela.numero)
    println(contaRafaela.saldo)

    println("depositando na conta da Rafaela")
    contaRafaela.deposita(50.0)
    println(contaRafaela.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta da Rafaela")
    contaRafaela.saca(250.0)
    println(contaRafaela.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para a Rafaela")

    if(contaFran.transfere(valor = 100.0, destino = contaRafaela)){
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaRafaela.saldo)
    println(contaFran.saldo)
}

class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double){
        if(valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double){
        if (saldo >= valor){
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            saldo = valor
//        }
//    }
}

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("Joao", 1002)
    contaJoao.titular = "João"
    var contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
    println(contaJoao)
    println(contaMaria)
}

fun testaLacos(){
    var i = 0
    while (i < 5) {
        val titular: String = "Rafaela $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("numeroConta $numeroConta")
        println("saldo $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1) {
        val titular: String = "Rafaela $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}


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