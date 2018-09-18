package com.greenfoxacademy.bankofsimba.model;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {
  private String name;
  private long balance;
  private String animalType;
  private boolean isKing;

  public BankAccount() {
  }

  public BankAccount(String name, long balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }
}
