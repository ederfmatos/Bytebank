package com.ederfmatos.bytebank.model

class Director(
        name: String,
        cpf: String,
        salary: Double,
        private val password: String,
        private val plr: Double
) : Employee(name = name, cpf = cpf, salary = salary) {

    fun authenticate(password: String): Boolean {
        return this.password == password
    }

    override val putBonus: Double = super.putBonus + salary + plr

    override fun toString(): String {
        return "Director(password='$password', plr='$plr') ${super.toString()}"
    }

}