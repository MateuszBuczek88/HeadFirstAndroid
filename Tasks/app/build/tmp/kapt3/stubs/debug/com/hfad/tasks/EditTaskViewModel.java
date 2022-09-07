package com.hfad.tasks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/hfad/tasks/EditTaskViewModel;", "Landroidx/lifecycle/ViewModel;", "taskId", "", "dao", "Lcom/hfad/tasks/TaskDao;", "(JLcom/hfad/tasks/TaskDao;)V", "_navigateToList", "Landroidx/lifecycle/MutableLiveData;", "", "getDao", "()Lcom/hfad/tasks/TaskDao;", "navigateToList", "Landroidx/lifecycle/LiveData;", "getNavigateToList", "()Landroidx/lifecycle/LiveData;", "task", "Lcom/hfad/tasks/Task;", "getTask", "deleteTask", "", "onNavigatedToList", "updateTask", "app_debug"})
public final class EditTaskViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.hfad.tasks.TaskDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.hfad.tasks.Task> task = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToList = null;
    
    public EditTaskViewModel(long taskId, @org.jetbrains.annotations.NotNull()
    com.hfad.tasks.TaskDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hfad.tasks.TaskDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hfad.tasks.Task> getTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToList() {
        return null;
    }
    
    public final void updateTask() {
    }
    
    public final void deleteTask() {
    }
    
    public final void onNavigatedToList() {
    }
}