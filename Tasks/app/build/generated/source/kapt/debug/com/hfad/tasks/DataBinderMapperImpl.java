package com.hfad.tasks;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.hfad.tasks.databinding.FragmentEditTaskBindingImpl;
import com.hfad.tasks.databinding.FragmentTasksBindingImpl;
import com.hfad.tasks.databinding.TaskItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTEDITTASK = 1;

  private static final int LAYOUT_FRAGMENTTASKS = 2;

  private static final int LAYOUT_TASKITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hfad.tasks.R.layout.fragment_edit_task, LAYOUT_FRAGMENTEDITTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hfad.tasks.R.layout.fragment_tasks, LAYOUT_FRAGMENTTASKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hfad.tasks.R.layout.task_item, LAYOUT_TASKITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTEDITTASK: {
          if ("layout/fragment_edit_task_0".equals(tag)) {
            return new FragmentEditTaskBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_task is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTASKS: {
          if ("layout/fragment_tasks_0".equals(tag)) {
            return new FragmentTasksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tasks is invalid. Received: " + tag);
        }
        case  LAYOUT_TASKITEM: {
          if ("layout/task_item_0".equals(tag)) {
            return new TaskItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for task_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "task");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_edit_task_0", com.hfad.tasks.R.layout.fragment_edit_task);
      sKeys.put("layout/fragment_tasks_0", com.hfad.tasks.R.layout.fragment_tasks);
      sKeys.put("layout/task_item_0", com.hfad.tasks.R.layout.task_item);
    }
  }
}
