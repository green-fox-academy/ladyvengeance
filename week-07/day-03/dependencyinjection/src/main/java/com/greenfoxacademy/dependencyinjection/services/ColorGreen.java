package com.greenfoxacademy.dependencyinjection.services;

import org.springframework.beans.factory.annotation.Autowired;

public class ColorGreen implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("'Tis the colour of emeralds");
  }
}
