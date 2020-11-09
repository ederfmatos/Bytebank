package com.ederfmatos.bytebank.model.account

import com.ederfmatos.bytebank.exceptions.InsufficientFundsException
import com.ederfmatos.bytebank.exceptions.InvalidValueException
import com.ederfmatos.bytebank.model.Customer

class SavingAccount(owner: Customer, number: Int) : Account(
        owner = owner,
        number = number
) {
    override fun withdraw(value: Double) {
        if (value > balance) {
            println("Não é possivel realizar o saque para a conta de $owner, pois o saldo em conta é de $balance e o valor que está sendo tentado sacar é de $value")
            throw InsufficientFundsException("O saldo é insuficiente! Saldo atual: $balance, valor a ser subtraido: $value")
        }

        if (value < 0) {
            println("Não é possivel realizar um saque de um valor negativo")
            throw InvalidValueException("Não é possivel realizar um saque de um valor negativo. Valor à ser subtraído: $value")
        }

        this.balance -= value
    }
}