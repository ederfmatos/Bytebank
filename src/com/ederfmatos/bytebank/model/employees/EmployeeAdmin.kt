package com.ederfmatos.bytebank.model.employees

import com.ederfmatos.bytebank.authentication.Authentic

abstract class EmployeeAdmin(
        name: String,
        cpf: String,
        salary: Double,
        protected val password: String
) : Employee(name = name, cpf = cpf, salary = salary), Authentic {

    override fun authenticate(password: String): Boolean {
        return this.password == password
    }

}