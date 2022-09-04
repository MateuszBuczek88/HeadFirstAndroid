package com.hfad.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TasksViewModel(val dao: TaskDao) : ViewModel() {
    var newTaskName = ""
    fun addTask() {
        viewModelScope.launch {
            val task = Task()
            task.taskName = newTaskName
            dao.insert(task)
        }
    }

    fun nukeTable() {
        viewModelScope.launch {
            dao.nukeAll()
        }
    }

    val tasks = dao.getAll()
        .map {
            it.joinToString(separator = "\n") {
                "Id: ${it.taskId},\nname: ${it.taskName},\nstatus: ${it.taskDone}"
            }
        }
}