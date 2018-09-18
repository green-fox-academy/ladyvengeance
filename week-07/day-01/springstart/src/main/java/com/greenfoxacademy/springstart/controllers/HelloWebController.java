package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong atomiclong = new AtomicLong();
  Random random = new Random();

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "God dag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Góðan dagin", "Góðan dag", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Konnichiwa", "Annyeong haseyo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("hello", hellos[random.nextInt(hellos.length - 1)]);
    model.addAttribute("name", name);
    model.addAttribute("counter", atomiclong.incrementAndGet());
    model.addAttribute("randomcolor", "color:rgb(" +
        random.nextInt(255) + "," +
        random.nextInt(255) + "," +
        random.nextInt(255) + ")");
    model.addAttribute("fontsize", 12 + random.nextInt(50));

    return "greeting";
  }

  @RequestMapping("/default")
  public String tldefault() {
    return "default";
  }

  @RequestMapping("/hello")
  public String hello() {
    return "hello";
  }
}