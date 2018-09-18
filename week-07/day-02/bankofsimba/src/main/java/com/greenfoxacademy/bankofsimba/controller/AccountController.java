package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

  private List<BankAccount> accounts;

  public AccountController() {
  accounts = new ArrayList<>();
  }

  @GetMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion"));
    return "show";
  }

  @GetMapping("/welcome")
  public String displayWelcome() {
    return "welcome";
  }
}
