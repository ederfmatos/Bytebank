package com.ederfmatos.bytebank.model.employees

class Director(
        name: String,
        cpf: String,
        salary: Double,
        password: String,
        private val plr: Double
) : EmployeeAdmin(name = name, cpf = cpf, salary = salary, password = password) {

    override val putBonus: Double
        get() = salary * 0.1 + salary + plr

}