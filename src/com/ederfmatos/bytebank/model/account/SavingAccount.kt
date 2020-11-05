package com.ederfmatos.bytebank.model.account

class SavingAccount(owner: String, number: Int) : Account(
        owner = owner,
        number = number
) {
    override fun withdraw(value: Double) {
        if (value > balance) {
            println("Não é possivel realizar o saque para a conta de $owner, pois o saldo em conta é de $balance e o valor que está sendo tentado sacar é de $value")
            return
        }

        if (value < 0) {
            println("Não é possivel realizar um saque de um valor negativo")
            return
        }

        this.balance -= value
    }
}