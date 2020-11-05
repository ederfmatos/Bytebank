package com.ederfmatos.bytebank.model.account

class CheckingAccount(owner: String, number: Int) : Account(
        owner = owner,
        number = number
) {

    override fun withdraw(value: Double) {
        val valueWithTax: Double = value + 0.1
        super.withdraw(valueWithTax)
    }

}