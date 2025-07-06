package com.motycka.edu.lesson03.model

/*
 Implement Square class that extends the Rectangle class.

    - It should have a constructor that takes one parameter for the side length.
    - It should override all methods from Rectangle class.
    - It should have a method to convert it to a 3D Cuboid with the same side length for width, height, and depth.
 */

class Square(val side: Double) : Rectangle(side, side) {

    override val width: Double
        get() = side

    override val length: Double
        get() = side

    override fun area(): Double = side * side

    override fun perimeter(): Double = 4 * side

    override fun numberOfSides(): Int = 4

    override fun to3D(depth: Double): Cuboid = Cuboid(side, side, depth)
}
