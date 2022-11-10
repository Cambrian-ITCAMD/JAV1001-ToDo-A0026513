package com.hannanmax.jav1001_todo_a0026513

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.hannanmax.jav1001_todo_a0026513.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var arrayList: ArrayList<ToDoContext> = ArrayList()
    var adapter: CustomToDoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = CustomToDoAdapter(this, arrayList)
        binding.lwTodolist.adapter = adapter

        binding.lwTodolist.adapter = adapter
        binding.btnAddNewTodo.setOnClickListener{
            binding.llAddNewTodo.visibility = View.VISIBLE
        }

        binding.btnSubmitNewTodo.setOnClickListener{
            if(binding.edtTitle.text.isNotEmpty()){
                arrayList.add(ToDoContext(binding.edtTitle.text.toString(), false))
                adapter = CustomToDoAdapter(this, arrayList)
                binding.lwTodolist.adapter = adapter
                binding.edtTitle.setText("")
                binding.llAddNewTodo.visibility = View.GONE
            } else {
                Toast.makeText(applicationContext,"Title field is empty",Toast.LENGTH_LONG).show()
            }
        }

    }
}