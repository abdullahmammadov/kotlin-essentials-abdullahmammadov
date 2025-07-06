package com.motycka.edu.lesson03

import java.time.LocalDate

class Assignment(
    val dueDate: LocalDate,  // public, immutable
    val assignee: String     // public, immutable
) {
    private var finalGrade: Int? = null  // private, mutable, nullable

    fun setFinalGrade(grade: Int) {
        require(grade in 0..100) { "Final grade must be between 0 and 100" }
        finalGrade = grade
    }

    fun getFinalGrade(): Int? {
        return finalGrade
    }

    fun main() {
        val assignment = Assignment(LocalDate.now(), "John Doe")
        assignment.setFinalGrade(90)
        println(assignment.getFinalGrade())  // Should print: 90
    }
}
