package com.ederfmatos.bytebank.model.employees

abstract class Employee(
        val name: String,
        val cpf: String,
        val salary: Double
) {

    abstract val putBonus: Double

    override fun toString(): String {
        return "Employee(name='$name', cpf='$cpf', salary=$salary)"
    }
}