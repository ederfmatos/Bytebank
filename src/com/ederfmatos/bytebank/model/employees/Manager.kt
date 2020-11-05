package com.ederfmatos.bytebank.model.employees

class Manager(
        name: String,
        cpf: String,
        salary: Double,
        private val password: String
) : EmployeeAdmin(name = name, cpf = cpf, salary = salary, password = password) {

    override val putBonus: Double
        get() = salary * 0.1 + salary

    override fun toString(): String {
        return "Manager(putBonus=$putBonus, ${super.toString()})"
    }

}