package com.motycka.edu.lesson02


const val ESPRESSO_PRICE = 2.5
const val DOUBLE_ESPRESSO_PRICE = 3.0
const val CAPPUCCINO_PRICE = 3.0
const val LATTE_PRICE = 3.5
const val AMERICANO_PRICE = 2.0
const val FLAT_WHITE_PRICE = 3.2

/*
    1. Get price bas on item names
    2. Get the lowest price from a list of prices
    3. Calculate a total price for a list of items
    4. Calculate a discount if 3 or more items are ordered (the cheapest item is free)
    5. Print the total price with a discount applied for each order
 */

// Step 1: Get price based on item name
fun getPrice(item: String): Double {
    return when (item) {
        ESPRESSO -> ESPRESSO_PRICE
        DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
        CAPPUCCINO -> CAPPUCCINO_PRICE
        LATTE -> LATTE_PRICE
        AMERICANO -> AMERICANO_PRICE
        FLAT_WHITE -> FLAT_WHITE_PRICE
        else -> 0.0
    }
}

// Step 2–5: Process orders
fun conditionals() {
    val coffeeOrders = mapOf(
        1 to listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO),
        2 to listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)
    )

    coffeeOrders.forEach { orderId, items ->
        println("Processing Order ID: $orderId")
        println("Items: $items")

        val itemPrices = items.map { getPrice(it) }
        val totalWithoutDiscount = itemPrices.sum()

        // Step 4: Apply discount if 3 or more items – cheapest item is free
        val discount = if (items.size >= 3) itemPrices.minOrNull() ?: 0.0 else 0.0
        val total = totalWithoutDiscount - discount

        println("Original total: $$totalWithoutDiscount")
        if (discount > 0) {
            println("Discount applied (cheapest item free): -$$discount")
        }
        println("Total price for Order ID $orderId: $${"%.2f".format(total)}\n")
    }
}

fun main() {
    conditionals()
}