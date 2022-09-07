package com.hfad.tasks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0019R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/hfad/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/hfad/tasks/TaskDao;", "(Lcom/hfad/tasks/TaskDao;)V", "_navigateToTask", "Landroidx/lifecycle/MutableLiveData;", "", "getDao", "()Lcom/hfad/tasks/TaskDao;", "navigateToTask", "Landroidx/lifecycle/LiveData;", "getNavigateToTask", "()Landroidx/lifecycle/LiveData;", "newTaskName", "", "getNewTaskName", "()Ljava/lang/String;", "setNewTaskName", "(Ljava/lang/String;)V", "tasks", "", "Lcom/hfad/tasks/Task;", "getTasks", "addTask", "", "nukeTable", "onTaskClicked", "taskId", "onTaskNavigated", "app_debug"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.hfad.tasks.TaskDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String newTaskName = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.hfad.tasks.Task>> tasks = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _navigateToTask = null;
    
    public TasksViewModel(@org.jetbrains.annotations.NotNull()
    com.hfad.tasks.TaskDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hfad.tasks.TaskDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewTaskName() {
        return null;
    }
    
    public final void setNewTaskName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void addTask() {
    }
    
    public final void nukeTable() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.hfad.tasks.Task>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getNavigateToTask() {
        return null;
    }
    
    public final void onTaskClicked(long taskId) {
    }
    
    public final void onTaskNavigated() {
    }
}