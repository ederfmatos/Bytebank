package com.ederfmatos.bytebank

import com.ederfmatos.bytebank.model.employees.Employee

class CalculatorPutBonus {

    var total: Double = 0.0
        private set

    fun register(employee: Employee): CalculatorPutBonus {
        this.total += employee.putBonus
        return this
    }

}