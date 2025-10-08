package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class ToDoEntryController {

    @GetMapping("/ToDos")
    public List<TodoEntry> getTodos() {
        return List.of(new TodoEntry("M1"), new TodoEntry("M2"), new TodoEntry("M2"));
    }
}
