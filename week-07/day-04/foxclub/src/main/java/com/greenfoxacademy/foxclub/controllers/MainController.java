package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String getMainPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    model.addAttribute("name", foxService.findFox(name));
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
