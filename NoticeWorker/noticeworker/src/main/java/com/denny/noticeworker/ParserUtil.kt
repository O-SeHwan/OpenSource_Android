package com.denny.noticeworker

fun String.isNumeric() : Boolean {
    return this.toDoubleOrNull() != null
}
