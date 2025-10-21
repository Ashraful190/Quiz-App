package com.company.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.company.quiz.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
    private val viewModel: PlayViewModel by viewModels()
    lateinit var binding: ActivityPlayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // ✅ Get selected category from intent
        val category = intent.getStringExtra("category") ?: ""

        // ✅ Load questions into ViewModel
        viewModel.loadQuestions(category)

        // ✅ Check if there are any questions
        if (LocalDataSource.questions.none { it.category == category }) {
            Toast.makeText(this, "No questions found for $category", Toast.LENGTH_LONG).show()
            finish()
            return
        }

        showCurrentQuestion()

        binding.btnNext.setOnClickListener {
            val selectedIndex = binding.radioGroup.indexOfChild(
                findViewById(binding.radioGroup.checkedRadioButtonId)
            )

            if (selectedIndex != -1) {
                viewModel.checkAnswer(selectedIndex)
                setNextQuestion()
            } else {
                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
            }
        }





    }

    private fun showCurrentQuestion() {

        val currentQestion = viewModel.getCurrentQuestion()

        binding.questionTv.text = currentQestion.question
        binding.option1.text = currentQestion.options[0]
        binding.option2.text = currentQestion.options[1]
        binding.option3.text = currentQestion.options[2]
        binding.option4.text = currentQestion.options[3]

        binding.radioGroup.clearCheck()

    }


    private fun setNextQuestion(){

        val nextQuestion = viewModel.getNextQuestion()

        if (nextQuestion!=null){
            showCurrentQuestion()
        }else{
            val resultIntent = Intent(this, ResultActivity::class.java)
            resultIntent.putExtra("score", viewModel.getScore())
            startActivity(resultIntent)
            finish()
        }

    }


}