package com.ederfmatos.bytebank.functions

import com.ederfmatos.bytebank.CalculatorPutBonus
import com.ederfmatos.bytebank.model.Director
import com.ederfmatos.bytebank.model.Employee
import com.ederfmatos.bytebank.model.Manager

fun testEmployees() {
    val employee = Employee(
            name = "Eder",
            cpf = "123456789",
            salary = 2500.0
    )

    println(employee)
    println("The bonus is ${employee.putBonus}")

    val manager = Manager(
            name = "Eder",
            cpf = "123456789",
            salary = 2500.0,
            password = "123456"
    )

    println(manager)
    println("The bonus is ${manager.putBonus} of manager ${manager.name}")

    val director = Director(
            name = "Eder",
            cpf = "0987654321",
            salary = 5000.0,
            password = "123456789",
            plr = 150.0
    )

    println(director)
    println("The bonus is ${director.putBonus} of director ${director.name}")

    val calculator = CalculatorPutBonus()
    calculator
            .register(manager)
            .register(director)
            .register(employee)

    println("O total calculado foi de ${calculator.total}")
}