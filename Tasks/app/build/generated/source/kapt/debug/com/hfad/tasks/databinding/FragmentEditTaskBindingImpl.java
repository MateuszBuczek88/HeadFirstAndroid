package com.hfad.tasks.databinding;
import com.hfad.tasks.R;
import com.hfad.tasks.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditTaskBindingImpl extends FragmentEditTaskBinding implements com.hfad.tasks.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener taskDoneandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.task.getValue().taskDone
            //         is viewModel.task.getValue().setTaskDone((boolean) callbackArg_0)
            boolean callbackArg_0 = taskDone.isChecked();
            // localize variables for thread safety
            // viewModel.task
            androidx.lifecycle.LiveData<com.hfad.tasks.Task> viewModelTask = null;
            // viewModel.task.getValue()
            com.hfad.tasks.Task viewModelTaskGetValue = null;
            // viewModel.task.getValue().taskDone
            boolean viewModelTaskTaskDone = false;
            // viewModel.task.getValue() != null
            boolean viewModelTaskGetValueJavaLangObjectNull = false;
            // viewModel
            com.hfad.tasks.EditTaskViewModel viewModel = mViewModel;
            // viewModel.task != null
            boolean viewModelTaskJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelTask = viewModel.getTask();

                viewModelTaskJavaLangObjectNull = (viewModelTask) != (null);
                if (viewModelTaskJavaLangObjectNull) {


                    viewModelTaskGetValue = viewModelTask.getValue();

                    viewModelTaskGetValueJavaLangObjectNull = (viewModelTaskGetValue) != (null);
                    if (viewModelTaskGetValueJavaLangObjectNull) {




                        viewModelTaskGetValue.setTaskDone(((boolean) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener taskNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.task.getValue().taskName
            //         is viewModel.task.getValue().setTaskName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(taskName);
            // localize variables for thread safety
            // viewModel.task
            androidx.lifecycle.LiveData<com.hfad.tasks.Task> viewModelTask = null;
            // viewModel.task.getValue()
            com.hfad.tasks.Task viewModelTaskGetValue = null;
            // viewModel.task.getValue().taskName
            java.lang.String viewModelTaskTaskName = null;
            // viewModel.task.getValue() != null
            boolean viewModelTaskGetValueJavaLangObjectNull = false;
            // viewModel
            com.hfad.tasks.EditTaskViewModel viewModel = mViewModel;
            // viewModel.task != null
            boolean viewModelTaskJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelTask = viewModel.getTask();

                viewModelTaskJavaLangObjectNull = (viewModelTask) != (null);
                if (viewModelTaskJavaLangObjectNull) {


                    viewModelTaskGetValue = viewModelTask.getValue();

                    viewModelTaskGetValueJavaLangObjectNull = (viewModelTaskGetValue) != (null);
                    if (viewModelTaskGetValueJavaLangObjectNull) {




                        viewModelTaskGetValue.setTaskName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentEditTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentEditTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[4]
            , (android.widget.CheckBox) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.Button) bindings[3]
            );
        this.deleteButton.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.taskDone.setTag(null);
        this.taskName.setTag(null);
        this.updateButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.hfad.tasks.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.hfad.tasks.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.hfad.tasks.EditTaskViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.hfad.tasks.EditTaskViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTask((androidx.lifecycle.LiveData<com.hfad.tasks.Task>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTask(androidx.lifecycle.LiveData<com.hfad.tasks.Task> ViewModelTask, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.hfad.tasks.Task viewModelTaskGetValue = null;
        androidx.lifecycle.LiveData<com.hfad.tasks.Task> viewModelTask = null;
        boolean viewModelTaskTaskDone = false;
        java.lang.String viewModelTaskTaskName = null;
        com.hfad.tasks.EditTaskViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.task
                    viewModelTask = viewModel.getTask();
                }
                updateLiveDataRegistration(0, viewModelTask);


                if (viewModelTask != null) {
                    // read viewModel.task.getValue()
                    viewModelTaskGetValue = viewModelTask.getValue();
                }


                if (viewModelTaskGetValue != null) {
                    // read viewModel.task.getValue().taskDone
                    viewModelTaskTaskDone = viewModelTaskGetValue.getTaskDone();
                    // read viewModel.task.getValue().taskName
                    viewModelTaskTaskName = viewModelTaskGetValue.getTaskName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.deleteButton.setOnClickListener(mCallback4);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.taskDone, (android.widget.CompoundButton.OnCheckedChangeListener)null, taskDoneandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.taskName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, taskNameandroidTextAttrChanged);
            this.updateButton.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.taskDone, viewModelTaskTaskDone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskName, viewModelTaskTaskName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.hfad.tasks.EditTaskViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.updateTask();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.hfad.tasks.EditTaskViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.deleteTask();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.task
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}