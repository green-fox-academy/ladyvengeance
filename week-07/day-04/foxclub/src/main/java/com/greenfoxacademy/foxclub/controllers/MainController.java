package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  Fox fox;

  @GetMapping("/")
  public String getMainPage() {
    return "index";
  }

  @GetMapping("/login")
  public String getLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String postLoginPage(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", fox.getName());
    return "login";
  }
}
