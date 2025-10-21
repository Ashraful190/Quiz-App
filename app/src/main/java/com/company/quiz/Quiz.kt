package com.company.quiz

data class Quiz(
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val category: String
)

