package com.ederfmatos.bytebank

import com.ederfmatos.bytebank.authentication.Authentic
import com.ederfmatos.bytebank.functions.forLoops
import com.ederfmatos.bytebank.functions.testAuthentication
import com.ederfmatos.bytebank.functions.testDifferentAccounts
import com.ederfmatos.bytebank.functions.testEmployees
import com.ederfmatos.bytebank.model.account.totalContas

fun main() {
    println("Hello World")

    forLoops()

    testEmployees()

    testDifferentAccounts()

    testAuthentication()

    println("O número de contas criadas é de $totalContas")

}

