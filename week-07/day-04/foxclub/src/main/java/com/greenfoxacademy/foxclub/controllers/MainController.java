package com.greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String getMainPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    model.addAttribute("name", name);
    model.addAttribute("food", food);
    model.addAttribute("drink", drink);
    model.addAttribute("tricks", tricks);
    return "index";
  }

  @GetMapping("/login")
  public String getLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String postLoginPage(@RequestParam("name") String name) {
    return "redirect:/?name=" + name;
  }
}
