package com.todoapi.todo.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapi.todo.model.Todo;
import com.todoapi.todo.repositories.TodoRepository;

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodos(){
        return todoRepository.findAll();
    }

    public Todo postTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public Todo updateTodo(UUID id, Todo todo){
        Optional<Todo> findTodo = todoRepository.findById(id);
        
        if(findTodo.isPresent()){
            Todo todoToUpdate = findTodo.get();

            todoToUpdate.setIsDone(todo.getIsDone());
            return todoRepository.save(todoToUpdate);
        } else{
            return null;
        }
    }
}

