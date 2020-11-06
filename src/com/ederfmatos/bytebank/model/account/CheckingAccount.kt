package com.ederfmatos.bytebank.model.account

import com.ederfmatos.bytebank.model.Customer

class CheckingAccount(owner: Customer, number: Int) : Account(
        owner = owner,
        number = number
) {

    override fun withdraw(value: Double) {
        val valueWithTax: Double = value + 0.1

        if (this.balance >= valueWithTax) {
            this.balance -= value
        }
    }

}