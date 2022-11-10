package com.hannanmax.jav1001_todo_a0026513

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.TextView

class CustomToDoAdapter (private val context: Context, private val toDoList: ArrayList<ToDoContext>) : BaseAdapter() {
    private lateinit var cbTitleIsCompleted: CheckBox
    private lateinit var tvTodoTitle: TextView

    override fun getCount(): Int {
        return toDoList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_todolist_layout, parent, false)
        cbTitleIsCompleted = view.findViewById(R.id.cb_title_is_completed)
        tvTodoTitle = view.findViewById(R.id.tv_todo_title)
        cbTitleIsCompleted.isChecked = toDoList[position].isCompleted!!
        tvTodoTitle.text = toDoList[position].title
        return view
    }
}