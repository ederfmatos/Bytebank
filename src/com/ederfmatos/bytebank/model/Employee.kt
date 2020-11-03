package com.ederfmatos.bytebank.model

open class Employee(
        val name: String,
        val cpf: String,
        val salary: Double
) {

    open val putBonus: Double = salary * 0.1

    override fun toString(): String {
        return "Employee(name='$name', cpf='$cpf', salary=$salary)"
    }
}