package com.cabarcalab.mytask.domain;

import com.cabarcalab.mytask.entity.Task;
import com.cabarcalab.mytask.entity.User;

import java.util.List;

public class TasksUserResponse {

    private User user;

    private List<Task> tasks;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
