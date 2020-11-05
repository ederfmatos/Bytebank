package com.ederfmatos.bytebank.model.employees

abstract class EmployeeAdmin(
        name: String,
        cpf: String,
        salary: Double,
        private val password: String
) : Employee(name = name, cpf = cpf, salary = salary) {

    fun authenticate(password: String): Boolean {
        return this.password == password
    }

}