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
            Category("Science", R.drawable.logo),
            Category("Math", R.drawable.checked),
            Category("History", R.drawable.logo),
            Category("Geography", R.drawable.checked),
            Category("Literature", R.drawable.checked),
            Category("Sports", R.drawable.logo)
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
