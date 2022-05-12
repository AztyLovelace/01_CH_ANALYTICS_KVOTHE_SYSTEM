package com.cabarcalab.mytask.controller;

import com.cabarcalab.mytask.domain.TasksUserResponse;
import com.cabarcalab.mytask.entity.Task;
import com.cabarcalab.mytask.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examples")
public class CustomerController {

    @Autowired
    private ICustomerService exampleService;

    /**
     * Obtiene una tarea.
     * La URL de este ejemplo es http://localhost:8080/examples/task
     * @return
     */
    @RequestMapping(value = "/task", method = RequestMethod.GET, produces = "application/json")
    public Task getExample() {

        final Task task = new Task();
        task.setName("Ejemplo");
        return task;
    }

    /**
     * Obtiene un usuario con sus tareas en base al ID del usuario.
     * URL de ejemplo http://localhost:8080/examples/tasks-by-user/8
     * @param id
     * @return
     */
    @RequestMapping(value = "/tasks-by-user/{id}", method = RequestMethod.GET, produces = "application/json")
    public TasksUserResponse getTasksByUser(@PathVariable Long id) {

        return exampleService.getTasksByUser(id);
    }
}
