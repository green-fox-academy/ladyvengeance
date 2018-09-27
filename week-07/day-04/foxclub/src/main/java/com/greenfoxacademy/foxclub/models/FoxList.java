package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.List;

public class FoxList {

  private List<Fox> foxes;

  public FoxList(List<Fox> foxes) {
    this.foxes = new ArrayList<>();
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }
}
