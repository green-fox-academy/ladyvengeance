package com.greenfoxacademy.dependencyinjection.services;

public class ColorGreen implements MyColor {
  @Override
  public void printColor() {
    System.out.println("'Tis the colour of emeralds");
  }
}
