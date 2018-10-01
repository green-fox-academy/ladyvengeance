package com.greenfoxacademy.restprojectfrontend.models.dtos;

public class Message {
  private String welcome_message;

  public Message() {
  }

  public Message(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_messageessage) {
    this.welcome_message = welcome_message;
  }
}
