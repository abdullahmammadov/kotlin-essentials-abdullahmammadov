package com.motycka.edu.lesson03


/*
 Implement an object called AreaCalculator with the following methods:
 - fun calculateRectangleArea(a: Double, b: Double): Double
 - fun calculateRectangleArea(a: Int, b: Int): Double
 - fun calculateCircleArea(r: Double): Double
 - fun calculateCircleArea(r: Int): Double
 - fun calculateTriangleArea(a: Double, b: Double): Double
 - fun calculateTriangleArea(a: Int, b: Int): Double

 The class demonstrates static polymorphism by providing multiple methods with the same name but different parameter types (Int and Double).
 The check will tolerate 0.001 inaccuracy.
 */

/*
 Uncomment the main function to try the solution.
 */

object AreaCalculator {

    fun calculateRectangleArea(a: Double, b: Double): Double {
        return a * b
    }

    fun calculateRectangleArea(a: Int, b: Int): Double {
        return a.toDouble() * b.toDouble()
    }

    fun calculateCircleArea(r: Double): Double {
        return Math.PI * r * r
    }

    fun calculateCircleArea(r: Int): Double {
        return Math.PI * r * r
    }

    fun calculateTriangleArea(a: Double, b: Double): Double {
        return 0.5 * a * b
    }

    fun calculateTriangleArea(a: Int, b: Int): Double {
        return 0.5 * a * b
    }
}

fun main() {
    println("Rectangle area (Int): " + AreaCalculator.calculateRectangleArea(5, 10))      // 50.0
    println("Rectangle area (Double): " + AreaCalculator.calculateRectangleArea(5.0, 10.0)) // 50.0

    println("Circle area (Int): " + AreaCalculator.calculateCircleArea(5))                // ≈ 78.54
    println("Circle area (Double): " + AreaCalculator.calculateCircleArea(5.0))           // ≈ 78.54

    println("Triangle area (Int): " + AreaCalculator.calculateTriangleArea(4, 6))         // 12.0
    println("Triangle area (Double): " + AreaCalculator.calculateTriangleArea(4.0, 6.0))  // 12.0
}
