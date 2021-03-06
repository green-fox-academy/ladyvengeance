package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
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
    accounts.add(new BankAccount("Simba", 2000, "lion", true, true));
    accounts.add(new BankAccount("Nala", 2000, "lion", false, true));
    accounts.add(new BankAccount("Sarabi", 2500, "lion", false, true));
    accounts.add(new BankAccount("Mufasa", 3000, "lion", true, true));
    accounts.add(new BankAccount("Scar", 500, "lion", true, false));
    accounts.add(new BankAccount("Shenzi", 200, "hyena", false, false));
    accounts.add(new BankAccount("Ed", 100, "hyena", false, false));
    accounts.add(new BankAccount("Banzai", 100, "hyena", false, false));
    accounts.add(new BankAccount("Timon", 300, "meerkat", false, true));
    accounts.add(new BankAccount("Pumbaa", 300, "warthog", false, true));
    accounts.add(new BankAccount("Rafiki", 1000, "mandrill", false, true));
    accounts.add(new BankAccount("Zazu", 1200, "red-billed hornbill", false, true));
  }

  @GetMapping("/accounts")
  public String showListOfAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "accounts";
  }

  @GetMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion", true, true));
    return "show";
  }

  @GetMapping("/welcome")
  public String displayWelcome() {
    return "welcome";
  }
}
