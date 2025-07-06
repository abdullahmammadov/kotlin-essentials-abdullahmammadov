package com.motycka.edu.lesson02

/*
 Coffee Shop Menu
 */

const val ESPRESSO = "Espresso"
const val DOUBLE_ESPRESSO = "Double Espresso"
const val CAPPUCCINO = "Cappuccino"
const val LATTE = "Latte"
const val MACCHIATO = "Macchiato"
const val MOCHA = "Mocha"
const val FLAT_WHITE = "Flat White"
const val AMERICANO = "Americano"

/*
    1. Create a list to store coffee menu items
    2. Initialize the list with constants defined above
    3. Define a mutable map to store orders, use: mutableMapOf<Int, List<String>>()
    4. Print the coffee menu items
    5. Create order1 with, 1x ESPRESSO, 2x CAPPUCCINO, and 1x AMERICANO
    6. Add order 1 to orders map
    7. Create order2 with, 1x ESPRESSO, 1x DOUBLE_ESPRESSO, and 1x FLAT_WHITE
    8. Add order 2 to orders map
    9. Print the orders placed, uncomment the println statement at the end
 */

// Step 1–2: Create and initialize the coffee menu
val coffeeMenu: List<String> = listOf(
    ESPRESSO,
    DOUBLE_ESPRESSO,
    CAPPUCCINO,
    LATTE,
    MACCHIATO,
    MOCHA,
    FLAT_WHITE,
    AMERICANO
)

fun collections() {
    // Step 3: Define mutable map for storing orders
    val orders: MutableMap<Int, List<String>> = mutableMapOf()

    println("\nWelcome to the Coffee Shop! Here is our menu:")

    // Step 4: Print menu items
    coffeeMenu.forEachIndexed { index, item ->
        println("${index + 1}. $item")
    }

    // Step 5: Create Order 1
    val order1 = listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO)
    // Step 6: Add Order 1
    orders[1] = order1

    // Step 7: Create Order 2
    val order2 = listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)
    // Step 8: Add Order 2
    orders[2] = order2

    // Step 9: Print Orders
    println("\nOrders placed:")
    orders.forEach { (orderId, items) ->
        println("Order ID: $orderId, Items: $items")
    }
}

fun main() {
    collections()
}
