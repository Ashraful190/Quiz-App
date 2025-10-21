package com.company.quiz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CategoryAdapter(
    private val context: Context,
    private val categories: List<Category>
) : BaseAdapter() {

    override fun getCount(): Int = categories.size

    override fun getItem(position: Int): Any = categories[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_category, parent, false)

        val imageView = view.findViewById<ImageView>(R.id.imageCategory)
        val textView = view.findViewById<TextView>(R.id.textCategoryName)

        val category = categories[position]
        imageView.setImageResource(category.imageResId)
        textView.text = category.name

        return view
    }
}
