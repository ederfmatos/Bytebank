package com.ederfmatos.bytebank.functions

fun showBalanceType(balance: Double) {
    when {
        balance == 0.0 -> println("Balance is neutral")
        balance > 0.0 -> println("Balance is positive")
        else -> println("Balance is negative")
    }
}