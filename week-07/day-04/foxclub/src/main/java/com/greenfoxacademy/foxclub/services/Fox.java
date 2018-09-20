package com.greenfoxacademy.foxclub.services;

import org.springframework.stereotype.Service;

@Service
public class Fox {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
