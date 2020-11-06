package com.ederfmatos.bytebank.model

class Address(
        var street: String = "",
        var neighborhood: String = "",
        var number: Int = 0,
        var city: String = "",
        var postalCode: String = "",
        var complement: String = ""
) {
    override fun toString(): String {
        return "Address(street='$street', neighborhood='$neighborhood', number=$number, city='$city', postalCode='$postalCode', complement='$complement')"
    }
}