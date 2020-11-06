package com.ederfmatos.bytebank.internal

import com.ederfmatos.bytebank.authentication.Authentic

class InternalSystem {

    fun enter(employeeAdmin: Authentic, password: String) {
        if (employeeAdmin.authenticate(password)) {
            println("Bem vindo ao ByteBank")
        } else {
            println("Falha na autenticação")
        }
    }

}