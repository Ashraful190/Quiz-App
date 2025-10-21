package com.company.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val gridView = findViewById<GridView>(R.id.gridViewCategories)

        val categories = listOf(
            Category("Science", R.drawable.science),
            Category("Math", R.drawable.math),
            Category("History", R.drawable.history),
            Category("Geography", R.drawable.geography),
            Category("Literature", R.drawable.literature),
            Category("Sports", R.drawable.sports)
        )

        val adapter = CategoryAdapter(this, categories)
        gridView.adapter = adapter




        gridView.setOnItemClickListener { _, _, position, _ ->
            val selectedCategory = categories[position].name

            val intent = Intent(this, PlayActivity::class.java)
            intent.putExtra("category", selectedCategory)
            startActivity(intent)
        }





    }
}
