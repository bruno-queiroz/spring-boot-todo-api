package com.todoapi.todo.dtos;

import jakarta.validation.constraints.NotNull;

public record TodoDto(@NotNull String task) {}
