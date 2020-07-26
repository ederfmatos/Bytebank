package com.ederfmatos.bytebank.model

class Director(
        name: String,
        cpf: String,
        salary: Double,
        private val password: String,
        val plr: Double
) : Employee(name = name, cpf = cpf, salary = salary) {

    fun authenticate(password: String): Boolean {
        return this.password == password
    }

    override fun toString(): String {
        return "Director(password='$password') ${super.toString()}"
    }

}