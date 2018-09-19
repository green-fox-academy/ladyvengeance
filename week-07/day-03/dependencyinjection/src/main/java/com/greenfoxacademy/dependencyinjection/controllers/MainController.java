package com.greenfoxacademy.dependencyinjection.controllers;

import com.greenfoxacademy.dependencyinjection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String showUseful() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showUsefulColored(Model model) {
    model.addAttribute(utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String showEmail(@RequestParam("email") String email, Model model) {
    model.addAttribute("validator", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "email";
  }
}
