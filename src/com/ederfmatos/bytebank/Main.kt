package com.ederfmatos.bytebank

import com.ederfmatos.bytebank.functions.testDifferentAccounts
import com.ederfmatos.bytebank.internal.InternalSystem
import com.ederfmatos.bytebank.model.employees.Director
import com.ederfmatos.bytebank.model.employees.EmployeeAdmin
import com.ederfmatos.bytebank.model.employees.Manager

fun main() {
    println("Hello World")

//    forLoops()

//    testEmployees()

//    testDifferentAccounts()

    val manager: EmployeeAdmin = Manager(name = "Eder", cpf = "123456789", salary = 5000.0, password = "1234")
    val director: EmployeeAdmin = Director(name = "Director", cpf = "123456789", salary = 50000.0, password = "1234", plr = 50.0)

    val internalSystem = InternalSystem();
    internalSystem.enter(manager, "1234")
    internalSystem.enter(director, "123456");

}

