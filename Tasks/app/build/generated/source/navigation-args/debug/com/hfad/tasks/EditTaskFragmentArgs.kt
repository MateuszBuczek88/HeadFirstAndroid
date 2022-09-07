package com.hfad.tasks

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class EditTaskFragmentArgs(
  public val taskId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("taskId", this.taskId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("taskId", this.taskId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EditTaskFragmentArgs {
      bundle.setClassLoader(EditTaskFragmentArgs::class.java.classLoader)
      val __taskId : Long
      if (bundle.containsKey("taskId")) {
        __taskId = bundle.getLong("taskId")
      } else {
        throw IllegalArgumentException("Required argument \"taskId\" is missing and does not have an android:defaultValue")
      }
      return EditTaskFragmentArgs(__taskId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): EditTaskFragmentArgs {
      val __taskId : Long?
      if (savedStateHandle.contains("taskId")) {
        __taskId = savedStateHandle["taskId"]
        if (__taskId == null) {
          throw IllegalArgumentException("Argument \"taskId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"taskId\" is missing and does not have an android:defaultValue")
      }
      return EditTaskFragmentArgs(__taskId)
    }
  }
}
