package com.ederfmatos.bytebank.model

import com.ederfmatos.bytebank.authentication.Authentic

class Customer(
        val name: String,
        val cpf: String,
        var address: Address = Address(),
        private val password: String
) : Authentic {

    override fun authenticate(password: String): Boolean {
        return this.password == password
    }

    override fun toString(): String {
        return "Customer(name='$name', cpf='$cpf', address=$address)"
    }

}