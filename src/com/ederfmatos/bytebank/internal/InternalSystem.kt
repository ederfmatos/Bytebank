package com.ederfmatos.bytebank.internal

import com.ederfmatos.bytebank.model.employees.EmployeeAdmin
import com.ederfmatos.bytebank.model.employees.Manager

class InternalSystem {

    fun enter(employeeAdmin: EmployeeAdmin, password: String) {
        if(employeeAdmin.authenticate(password)) {
            println("Bem vindo ao ByteBank")
        } else {
            println("Falha na autenticação")
        }
    }

}