package com.ederfmatos.bytebank

import com.ederfmatos.bytebank.functions.forLoops
import com.ederfmatos.bytebank.functions.testAuthentication
import com.ederfmatos.bytebank.functions.testDifferentAccounts
import com.ederfmatos.bytebank.functions.testEmployees

fun main() {
    println("Hello World")

    forLoops()

    testEmployees()

    testDifferentAccounts()

    testAuthentication()
}

