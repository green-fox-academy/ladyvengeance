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
  public String list(@RequestParam(value = "isActive", required = false) Boolean isActive,
                     @RequestParam(value = "isUrgent", required = false) Boolean isUrgent, Model model) {

    if (isActive) {
      if (isUrgent) {
       model.addAttribute("todos", todoRepository.findByIsDoneAndIsUrgent(false, true));
      } else {
        model.addAttribute("todos", todoRepository.findByIsDone(false));
      }
    } else if (isUrgent) {
      model.addAttribute("todos", todoRepository.findByIsUrgent(true));
    }

//    if (isActive == null && isUrgent == null) {
//      model.addAttribute("todos", todoRepository.findAll());
//    } else if (isActive && isUrgent == null) {
//      model.addAttribute("todos", todoRepository.findByIsDoneFalse());
//    } else if (!isActive && isUrgent == null) {
//      model.addAttribute("todos", todoRepository.findByIsDoneTrue());
//    } else if (isUrgent == true && isActive == null) {
//      model.addAttribute("todos", todoRepository.findByIsUrgentTrue());
//    } else if (isUrgent == false && isActive == null) {
//      model.addAttribute("todos", todoRepository.findByIsUrgentFalse());
//    } else if (isActive == true && isUrgent == true) {
//      model.addAttribute("todos", todoRepository.findByIsDoneFalseAndIsUrgentTrue());
//    }
    return "todolist";
  }
}
