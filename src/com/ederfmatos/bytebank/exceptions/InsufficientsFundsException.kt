package com.ederfmatos.bytebank.exceptions

class InsufficientFundsException(
        override val message: String? = "Saldo insuficiente"
) : Exception(message)