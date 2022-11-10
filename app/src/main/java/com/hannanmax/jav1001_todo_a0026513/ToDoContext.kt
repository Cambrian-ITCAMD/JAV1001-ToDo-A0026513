package com.hannanmax.jav1001_todo_a0026513

class ToDoContext {
    var title: String? = ""
    var isCompleted: Boolean? = false

    constructor(title: String, isCompleted: Boolean) {
        this.title = title
        this.isCompleted = isCompleted
    }

    fun gettitle(): String? {
        return title
    }

    fun settitle(title: String?) {
        this.title = title
    }

    fun getisCompleted(): Boolean? {
        return isCompleted
    }

    fun setIsCompleted(isCompleted: Boolean?) {
        this.isCompleted = isCompleted
    }
}