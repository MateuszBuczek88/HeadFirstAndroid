package com.hfad.tasks

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.Long

public class TasksFragmentDirections private constructor() {
  private data class ActionTasksFragmentToEditTaskFragment(
    public val taskId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_tasksFragment_to_editTaskFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("taskId", this.taskId)
        return result
      }
  }

  public companion object {
    public fun actionTasksFragmentToEditTaskFragment(taskId: Long): NavDirections =
        ActionTasksFragmentToEditTaskFragment(taskId)
  }
}
