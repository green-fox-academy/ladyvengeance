package com.greenfoxacademy.springwithsql.controllers;

import com.greenfoxacademy.springwithsql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping("/todo")
  public String showTodo() {
    return "todo";
  }

  @GetMapping(value = {"/", "/list"})
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }
}
