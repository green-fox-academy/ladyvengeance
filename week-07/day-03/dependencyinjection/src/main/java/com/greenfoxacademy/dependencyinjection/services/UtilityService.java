package com.greenfoxacademy.dependencyinjection.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean validateEmail(String email) {
    return (email.contains("@") && email.contains("."));
  }

  public String caesarCypher(String input, int number) {
    String result = "";
    for(int i = 0; i < input.length(); i++) {
      result += (char)((int)input.charAt(i) + number);
    }
    return result;
  }
}
