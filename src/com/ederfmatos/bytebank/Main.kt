package com.ederfmatos.bytebank

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
//    println("Hello World")
//
//    forLoops()
//
//    testEmployees()
//
//    testDifferentAccounts()
//
//    testAuthentication()
//
//    println("O número de contas criadas é de ${Account.total}")

//    val customer: Customer? = null
//    println(customer?.address?.city?.length)

//    val salarios = bigDecimalArrayOf("1500.19", "4850.50", "3200.00", "4420.00", "10000.00")
//    println(salarios.contentToString())
//
//    val aumento = "1.1".toBigDecimal()
//
//    val salarioComAumento = salarios
//            .map { salario ->
//                var novoSalario = (salario * aumento).setScale(2, RoundingMode.HALF_UP)
//                if (novoSalario - salario < "500".toBigDecimal()) {
//                    novoSalario = salario + "500".toBigDecimal()
//                }
//                novoSalario
//            }
//            .toTypedArray()
//
//    val soma: BigDecimal = salarioComAumento.reduce { it, accum -> it.plus(accum) }
//
//    println(salarioComAumento.contentToString())
//    println("A soma doa salários é $soma")

    val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
    val lastAges = ages.takeLast(3)
    println(lastAges)
}

