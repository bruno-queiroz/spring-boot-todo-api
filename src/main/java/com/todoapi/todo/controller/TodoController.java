package com.todoapi.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapi.todo.model.Todo;
import com.todoapi.todo.services.TodoService;

@RestController
@RequestMapping("/")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    List<Todo> getTodos() {
        return todoService.getTodos();
    }
    
}
