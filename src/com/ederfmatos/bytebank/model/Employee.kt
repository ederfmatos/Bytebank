package com.ederfmatos.bytebank.model

open class Employee(
        val name: String,
        val cpf: String,
        val salary: Double
) {

    fun putBonus(): Double {
        return salary * 0.1;
    }

    override fun toString(): String {
        return "Employee(name='$name', cpf='$cpf', salary=$salary)"
    }
}