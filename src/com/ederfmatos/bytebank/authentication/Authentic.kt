package com.ederfmatos.bytebank.authentication

interface Authentic {

    fun authenticate(password: String): Boolean

}