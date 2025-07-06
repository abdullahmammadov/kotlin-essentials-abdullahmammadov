package com.motycka.edu.lesson03.model
import com.motycka.edu.lesson03.model.Sphere

import kotlin.math.PI
import kotlin.math.pow

/*
 Implement Circle class that implements Shape2D and Ellipse interfaces.

    - It should have a constructor that takes one parameter for the radius.
    - It should override all methods from Shape2D and Ellipse interfaces.
 */
// Interface for 2D Shapes
class Circle(private val radiusValue: Double) : Shape2D, Ellipse {

    // Ellipse interface requirement
    override val radius: Double
        get() = radiusValue

    // Shape2D interface
    override fun area(): Double {
        return PI * radius.pow(2)
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }

    // Ellipse interface's to3D() method
    override fun to3D(): Shape3D {
        return Sphere(radius)
    }
}