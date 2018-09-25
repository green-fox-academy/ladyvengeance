package com.greenfoxacademy.bankofsimba.models;
import java.text.DecimalFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isGoodGuy;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isGoodGuy) {
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

  public String getBalance() {
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    return decimalFormat.format(balance) + " Zebra";
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
