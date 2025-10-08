package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;

public class ToDoEntryController {

    @GetMapping("/ToDos")
    public String getTodos() {
        return "Hello World";
    }
}
