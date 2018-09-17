package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong atomiclong = new AtomicLong();

  @RequestMapping("/greeting")
  public Greeting greet(@RequestParam("name") String name) {
    Greeting greeting = new Greeting(atomiclong.incrementAndGet(), "Hello " + name + "!");
    return greeting;
  }
}
