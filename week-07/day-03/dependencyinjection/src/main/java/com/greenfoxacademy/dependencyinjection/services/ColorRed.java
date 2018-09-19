package com.greenfoxacademy.dependencyinjection.services;

import org.springframework.beans.factory.annotation.Autowired;

public class ColorRed implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("The deepest of crimson shall only compare");
  }
}
