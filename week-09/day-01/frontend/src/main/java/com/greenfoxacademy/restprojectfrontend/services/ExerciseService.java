package com.greenfoxacademy.restprojectfrontend.services;

import com.greenfoxacademy.restprojectfrontend.models.dtos.DoUntil;

public interface ExerciseService {
  void saveData(String endpoint, String data);
  Integer checkActionUntil(String action, DoUntil number);
  Integer sumUntil(Integer action);
  Integer factorUntil(Integer action);
  Integer checkWhatWithNumbers(String what, Integer[] numbers);
  Integer sumNumbers();
  Integer multiplyNumbers();
  Integer[] doubleNumbers();
}
