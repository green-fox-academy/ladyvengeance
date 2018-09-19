package com.greenfoxacademy.dependencyinjection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorBlue implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("The cerulean sky is its likeness");
  }
}
