package com.todoapi.todo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapi.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, UUID>{}
