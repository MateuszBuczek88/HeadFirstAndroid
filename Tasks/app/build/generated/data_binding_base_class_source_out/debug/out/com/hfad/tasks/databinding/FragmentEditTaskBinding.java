// Generated by data binding compiler. Do not edit!
package com.hfad.tasks.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.hfad.tasks.EditTaskViewModel;
import com.hfad.tasks.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentEditTaskBinding extends ViewDataBinding {
  @NonNull
  public final Button deleteButton;

  @NonNull
  public final CheckBox taskDone;

  @NonNull
  public final EditText taskName;

  @NonNull
  public final Button updateButton;

  @Bindable
  protected EditTaskViewModel mViewModel;

  protected FragmentEditTaskBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button deleteButton, CheckBox taskDone, EditText taskName, Button updateButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.deleteButton = deleteButton;
    this.taskDone = taskDone;
    this.taskName = taskName;
    this.updateButton = updateButton;
  }

  public abstract void setViewModel(@Nullable EditTaskViewModel viewModel);

  @Nullable
  public EditTaskViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentEditTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_edit_task, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEditTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEditTaskBinding>inflateInternal(inflater, R.layout.fragment_edit_task, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEditTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_edit_task, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEditTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEditTaskBinding>inflateInternal(inflater, R.layout.fragment_edit_task, null, false, component);
  }

  public static FragmentEditTaskBinding bind(@NonNull View view) {
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
  public static FragmentEditTaskBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEditTaskBinding)bind(component, view, R.layout.fragment_edit_task);
  }
}
