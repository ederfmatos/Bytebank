package com.ederfmatos.bytebank.model.employees

import com.ederfmatos.bytebank.authentication.Authentic

class Director(
        name: String,
        cpf: String,
        salary: Double,
        password: String,
        private val plr: Double
) : EmployeeAdmin(name = name, cpf = cpf, salary = salary, password = password), Authentic {

    override val putBonus: Double
        get() = salary * 0.1 + salary + plr

}