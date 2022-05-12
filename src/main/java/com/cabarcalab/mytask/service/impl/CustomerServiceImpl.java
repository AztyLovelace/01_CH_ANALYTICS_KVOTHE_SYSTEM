package com.cabarcalab.mytask.service.impl;

import com.cabarcalab.mytask.domain.TasksUserResponse;
import com.cabarcalab.mytask.entity.Task;
import com.cabarcalab.mytask.entity.User;
import com.cabarcalab.mytask.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Override
    public TasksUserResponse getTasksByUser(final Long userId) {

        final User user = new User(userId, "cabarca", "1234");

        final Task task1 = new Task(1L, "Example 1", "Es un ejemplo", new Date(), null, userId, Boolean.FALSE);
        final Task task2 = new Task(2L, "Example 2", "Es un ejemplo", new Date(), new Date(), userId, Boolean.TRUE);
        final List<Task> list = new ArrayList<>();
        list.add(task1);
        list.add(task2);

        final TasksUserResponse response = new TasksUserResponse();
        response.setUser(user);
        response.setTasks(list);

        return response;
    }
}
