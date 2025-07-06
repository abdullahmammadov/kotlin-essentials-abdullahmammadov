package com.motycka.edu.lesson02

/*
Define String variables for two types of coffee: espresso and cappuccino.
 */
const val espresso = "Espresso"
const val cappuccino = "Cappuccino"

/*
Define Double variables for the prices of espresso and cappuccino.
 */
const val espressoPrice = 2.5
const val cappuccinoPrice = 3.0

fun variables(espressoQuantity: Int, cappuccinoQuantity: Int) {
    // Calculate total price
    val totalPrice: Double = espressoQuantity * espressoPrice + cappuccinoQuantity * cappuccinoPrice

    println("Total Price: $$totalPrice")
}

fun main() {
    val espressoQuantity = 2
    val cappuccinoQuantity = 1

    variables(espressoQuantity, cappuccinoQuantity)
}
