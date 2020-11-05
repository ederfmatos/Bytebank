package com.ederfmatos.bytebank.model.account

abstract class Account(
        protected val owner: String,
        protected val number: Int
) {

    var balance = 0.0
        protected set

    fun deposit(price: Double) {
        if (price < 0) {
            println("Não é possivel realizar um deposito de um valor negativo")
            return
        }

        this.balance += price
    }

    abstract fun withdraw(value: Double)

    fun transfer(value: Double, destiny: Account) {
        if (value > balance) {
            println("""Não é possivel realizar uma transferência para a conta de ${destiny.owner} a partir da conta de $owner, pois o saldo em conta é de $balance e o valor que está sendo transferido é de $value""")
            return
        }

        if (value < 0) {
            println("Não é possivel realizar a transferência de um valor negativo")
            return
        }

        this.withdraw(value)
        destiny.deposit(value)
    }

    override fun toString(): String {
        return "Account(owner='$owner', number=$number, balance=$balance)"
    }

}