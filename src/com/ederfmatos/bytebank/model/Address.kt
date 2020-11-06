package com.ederfmatos.bytebank.model

class Address(
        var street: String = "",
        var neighborhood: String = "",
        var number: Int = 0,
        var city: String = "",
        var postalCode: String = "",
        var complement: String = ""
)