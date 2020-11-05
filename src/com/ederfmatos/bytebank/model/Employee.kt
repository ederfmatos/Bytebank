package com.ederfmatos.bytebank.model

abstract class Employee(
        val name: String,
        val cpf: String,
        val salary: Double
) {

    open val putBonus: Double
        get() {
            return salary * 0.1
        }

    override fun toString(): String {
        return "Employee(name='$name', cpf='$cpf', salary=$salary)"
    }
}