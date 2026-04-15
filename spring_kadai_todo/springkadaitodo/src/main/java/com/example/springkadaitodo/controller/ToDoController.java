package com.example.springkadaitodo.controller;

import com.example.springkadaitodo.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/todo")
    public String showTodoList(Model model) {
        model.addAttribute("todos", toDoService.findAll());
        return "todoView";
    }
}
