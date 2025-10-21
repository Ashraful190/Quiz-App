package com.company.quiz

import androidx.lifecycle.ViewModel

class PlayViewModel : ViewModel() {
    private var questions: List<Quiz> = listOf()
    private var currentIndex = 0
    private var score = 0

    fun loadQuestions(category: String) {
        questions = LocalDataSource.questions.filter {
            it.category == category
        }
        currentIndex = 0
        score = 0
    }

    fun getCurrentQuestion(): Quiz = questions[currentIndex]

    fun getNextQuestion(): Quiz? {
        return if (currentIndex < questions.size - 1) {
            currentIndex++
            questions[currentIndex]
        } else {
            null
        }
    }

    fun checkAnswer(selectedIndex: Int) {
        if (questions[currentIndex].correctAnswerIndex == selectedIndex) {
            score++
        }
    }

    fun getScore(): Int = score
}
