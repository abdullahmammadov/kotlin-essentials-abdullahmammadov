package com.motycka.edu.lesson02

val coffeeOrders = mutableMapOf<Int, List<String>>()
var nextOrderId = 1

fun placerOrder(items: List<String>): Int {
    val id = nextOrderId++
    coffeeOrders[id] = items
    println("Order placed: ID=$id, Items=$items")
    return id
}

fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId] ?: emptyList()
    val total = items.sumOf { getPrice(it) }
    println("Order ID $orderId total amount: $$total")
    return total
}

fun completeOrder(orderId: Int) {
    coffeeOrders.remove(orderId)
    println("Order ID $orderId completed and removed from the system.")
}

fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placerOrder(items)
    val totalToPay = payOrder(orderId)

    if (payment < totalToPay) {
        println("Insufficient payment! Payment: $$payment, required: $$totalToPay")
        // You can handle this by throwing an exception or returning negative change
        completeOrder(orderId)  // optional: cancel order on failure
        return -1.0
    }

    val change = payment - totalToPay

    completeOrder(orderId)

    println("Payment accepted. Change to return: $$change")
    return change
}

fun main() {
    processOrder(listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO), 20.0)
    processOrder(listOf(ESPRESSO, FLAT_WHITE, AMERICANO), 10.0)
    processOrder(listOf(ESPRESSO, ESPRESSO, DOUBLE_ESPRESSO), 5.0) // will fail due to insufficient payment
}
