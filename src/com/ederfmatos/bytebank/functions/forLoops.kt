package com.ederfmatos.bytebank.functions

import com.ederfmatos.bytebank.exceptions.InsufficientFundsException
import com.ederfmatos.bytebank.model.Customer
import com.ederfmatos.bytebank.model.account.SavingAccount

fun forLoops() {
    for (i in 1 downTo 0 step 3) {
        println("")

        val customer = Customer(name = "Eder", cpf = "123456789", password = "123456")
        val account = SavingAccount(customer, 1095)
        account.deposit(100.0)

//        println(
//            """The account owner is ${account.owner} with number ${account.number} and balance ${account.balance}"""
//        )

        println(account)
        account.deposit(15.0)
        println(account)
        account.withdraw(48.0)
        println(account)

        try {
            account.withdraw(148.0)
            println("Transferencia realizada com sucesso")
        } catch (e: InsufficientFundsException) {
            e.printStackTrace()
            println("Saldo insuficiente")
        }

        val customer2 = Customer(name = "Toroxa", cpf = "123456789", password = "123456")
        val account2 = SavingAccount(number = 75, owner = customer2)
        account.transfer(75.0, account2)

        println(account)
        println(account2)

        showBalanceType(account.balance)
    }


//    for (i in 6..8) {
//        println(i)
//    }
//
//    for (i in 6..8) {
//        if (i == 7) continue
//        println(i)
//    }
}