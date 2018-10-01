package com.greenfoxacademy.restprojectfrontend.models.dtos;

public class Input {

  private Integer received;
  private Integer result;

  public Input() {
    this.received = received;
  }

  public Input(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
