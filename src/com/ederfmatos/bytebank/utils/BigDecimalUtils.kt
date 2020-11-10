package com.ederfmatos.bytebank.utils

import java.math.BigDecimal

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array(values.size) { index -> values[index].toBigDecimal() }
}