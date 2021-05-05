fun testaComportamentosConta() {
    val contaRafaela = ContaCorrente(titular = "Rafaela", numero = 1000)
    contaRafaela.deposita(200.0)

    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001)
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

    if (contaFran.transfere(valor = 100.0, destino = contaRafaela)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaRafaela.saldo)
    println(contaFran.saldo)
}
