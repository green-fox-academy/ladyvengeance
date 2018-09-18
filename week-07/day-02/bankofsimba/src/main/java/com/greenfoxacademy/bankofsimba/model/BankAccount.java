package com.greenfoxacademy.bankofsimba.model;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {
  private String name;
  private long balance;
  private String animalType;
  private boolean isKing;
  private boolean isGoodGuy;

  public BankAccount() {
  }

  public BankAccount(String name, long balance, String animalType, boolean isKing, boolean isGoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGoodGuy = isGoodGuy;
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

  public boolean isGoodGuy() {
    return isGoodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    isGoodGuy = goodGuy;
  }
}
