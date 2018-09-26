package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

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
  public String list(@RequestParam(required = false) Boolean isActive,
                     @RequestParam(required = false) Boolean isUrgent, Model model) {

    if (isActive == null) {
      if (isUrgent == null) {
        model.addAttribute("todos", todoRepository.findAll());
      } else if (isUrgent) {
        model.addAttribute("todos", todoRepository.findByIsUrgent(true));
      } else if (!isUrgent) {
        model.addAttribute("todos", todoRepository.findByIsUrgent(false));
      }
    } else if (isActive) {
      if (isUrgent == null) {
        model.addAttribute("todos", todoRepository.findByIsDone(false));
      } else if (isUrgent) {
        model.addAttribute("todos", todoRepository.findByIsDoneAndIsUrgent(false, true));
      } else if (!isUrgent) {
        model.addAttribute("todos", todoRepository.findByIsDoneAndIsUrgent(false, false));
      }
    } else if (!isActive) {
      if (isUrgent == null) {
        model.addAttribute("todos", todoRepository.findByIsDone(true));
      } else if (isUrgent) {
        model.addAttribute("todos", todoRepository.findByIsDoneAndIsUrgent(true, true));
      } else if (!isUrgent) {
        model.addAttribute("todos", todoRepository.findByIsDoneAndIsUrgent(true, false));
      }
    }
    return "todolist";
  }
}


//    isUrgent = isUrgent == null ? true : isUrgent;
//    isActive = isActive == null ? false : isActive;
