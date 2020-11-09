package com.ederfmatos.bytebank.functions

import com.ederfmatos.bytebank.exceptions.InvalidValueException
import com.ederfmatos.bytebank.model.Customer
import com.ederfmatos.bytebank.model.account.Account
import com.ederfmatos.bytebank.model.account.CheckingAccount
import com.ederfmatos.bytebank.model.account.SavingAccount

fun testDifferentAccounts() {
    val customer = Customer(name = "Eder", cpf = "123456789", password = "123456")
    val customer2 = Customer(name = "Japones", cpf = "123456789", password = "123456")

    val checkingAccount: Account = CheckingAccount(owner = customer, number = 1500)
    val savingAccount: Account = SavingAccount(owner = customer2, number = 1600)

    checkingAccount.deposit(1000.0)
    savingAccount.deposit(1000.0)


    println("Saldo antes saque da conta corrente $checkingAccount")
    println("Saldo antes saque da conta poupança $savingAccount")
    println("____________________________________")

    checkingAccount.withdraw(100.0)
    savingAccount.withdraw(100.0)

    try {
        savingAccount.withdraw(-1.0)
    } catch(e: InvalidValueException) {
        e.printStackTrace()
        println("Valor inválido")
    }

    println("Saldo após saque da conta corrente $checkingAccount")
    println("Saldo após saque da conta poupança $savingAccount")
    println("____________________________________")

    checkingAccount.transfer(50.0, savingAccount)
    println("Saldo após transferencia da conta corrente para conta poupança - conta corrente $checkingAccount")
    println("Saldo após transferencia da conta corrente para conta poupança - conta poupança $savingAccount")
    println("____________________________________")

    savingAccount.transfer(51.0, checkingAccount)
    println("Saldo após transferencia da conta poupança para conta corrente - conta corrente $checkingAccount")
    println("Saldo após transferencia da conta poupança para conta corrente - conta poupança $savingAccount")
}