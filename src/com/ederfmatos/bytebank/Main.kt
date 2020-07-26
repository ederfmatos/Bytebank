package com.ederfmatos.bytebank

import com.ederfmatos.bytebank.model.Employee
import com.ederfmatos.bytebank.model.Manager

fun main() {
    println("Hello World")

//    forLoops()

    val employee = Employee(
            name = "Eder",
            cpf = "123456789",
            salary = 2500.0
    )

    println(employee)
    println("The bonus is ${employee.putBonus()}")

    val manager = Manager(
            name = "Eder",
            cpf = "123456789",
            salary = 2500.0,
            password = "123456"
    )

    println(manager)
    println("The bonus is ${manager.putBonus()} of manager ${manager.name}")
}