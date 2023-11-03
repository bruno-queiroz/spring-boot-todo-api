package com.todoapi.todo.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @PatchMapping("/todos/{id}")
    Todo updateTodo(@PathVariable UUID id, @RequestBody Todo isDone) {
        return todoService.updateTodo(id, isDone);
    }

    @DeleteMapping("/todos/{id}")
    Optional<Todo> removeTodo(@PathVariable UUID id){
        return todoService.removeTodo(id); // don't return Optional
    }

}
