// Generated by data binding compiler. Do not edit!
package com.hfad.tasks.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.hfad.tasks.R;
import com.hfad.tasks.Task;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TaskItemBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox taskDone;

  @NonNull
  public final TextView taskName;

  @Bindable
  protected Task mTask;

  protected TaskItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CheckBox taskDone, TextView taskName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.taskDone = taskDone;
    this.taskName = taskName;
  }

  public abstract void setTask(@Nullable Task task);

  @Nullable
  public Task getTask() {
    return mTask;
  }

  @NonNull
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.task_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TaskItemBinding>inflateInternal(inflater, R.layout.task_item, root, attachToRoot, component);
  }

  @NonNull
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.task_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TaskItemBinding>inflateInternal(inflater, R.layout.task_item, null, false, component);
  }

  public static TaskItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static TaskItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (TaskItemBinding)bind(component, view, R.layout.task_item);
  }
}