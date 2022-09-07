package com.hfad.tasks

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class EditTaskFragmentDirections private constructor() {
  public companion object {
    public fun actionEditTaskFragmentToTasksFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_editTaskFragment_to_tasksFragment)
  }
}
