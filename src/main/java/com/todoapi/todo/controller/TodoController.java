package com.todoapi.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapi.todo.model.Todo;
import com.todoapi.todo.services.TodoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    List<Todo> getTodos() {
        return todoService.getTodos();
    }
    
    @PostMapping("/todos")
    Todo postTodo(@Valid @RequestBody Todo todo){
        return todoService.postTodo(todo);
    }
}
