package com.cabarcalab.mytask.service;

import com.cabarcalab.mytask.domain.TasksUserResponse;

/**
 * Interface Service Example
 */
public interface ICustomerService {

    TasksUserResponse getTasksByUser(Long userId);
}
