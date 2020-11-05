package com.ederfmatos.bytebank.functions

import com.ederfmatos.bytebank.internal.InternalSystem
import com.ederfmatos.bytebank.model.Customer
import com.ederfmatos.bytebank.model.employees.Director
import com.ederfmatos.bytebank.model.employees.EmployeeAdmin
import com.ederfmatos.bytebank.model.employees.Manager

fun testAuthentication() {
    val manager: EmployeeAdmin = Manager(name = "Eder", cpf = "123456789", salary = 5000.0, password = "1234")
    val director: EmployeeAdmin = Director(name = "Director", cpf = "123456789", salary = 50000.0, password = "1234", plr = 50.0)
    val customer = Customer(name = "Eder", cpf = "1234564879", password = "123154")

    val internalSystem = InternalSystem();
    internalSystem.enter(manager, "1234")
    internalSystem.enter(director, "123456")
    internalSystem.enter(customer, "1234")
}