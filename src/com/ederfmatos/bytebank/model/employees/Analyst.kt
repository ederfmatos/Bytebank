package com.ederfmatos.bytebank.model.employees

class Analyst(name: String, cpf: String, salary: Double) : Employee(name, cpf, salary) {
    override val putBonus: Double
        get() = salary * 0.1
}