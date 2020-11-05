package com.ederfmatos.bytebank.functions

import com.ederfmatos.bytebank.model.account.Account
import com.ederfmatos.bytebank.model.account.CheckingAccount
import com.ederfmatos.bytebank.model.account.SavingAccount

fun testDifferentAccounts() {
    val checkingAccount: Account = CheckingAccount(owner = "Eder", number = 1500)
    val savingAccount: Account = SavingAccount(owner = "Japoner", number = 1600)

    checkingAccount.deposit(1000.0)
    savingAccount.deposit(1000.0)


    println("Saldo antes saque da conta corrente $checkingAccount")
    println("Saldo antes saque da conta poupança $savingAccount")
    println("____________________________________")

    checkingAccount.withdraw(100.0)
    savingAccount.withdraw(100.0)

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