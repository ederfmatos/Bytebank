package com.ederfmatos.bytebank.model

class Manager(
        name: String,
        cpf: String,
        salary: Double,
        private val password: String
) : Employee(name = name, cpf = cpf, salary = salary) {

    fun authenticate(password: String): Boolean {
        return this.password == password
    }

    override val putBonus: Double
        get() = salary * 0.2

    override fun toString(): String {
        return "Manager(password='$password') ${super.toString()}"
    }

}