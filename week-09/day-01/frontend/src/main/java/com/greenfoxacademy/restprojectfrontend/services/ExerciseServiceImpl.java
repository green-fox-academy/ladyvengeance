package com.greenfoxacademy.restprojectfrontend.services;

import com.greenfoxacademy.restprojectfrontend.models.dtos.DoUntil;
import com.greenfoxacademy.restprojectfrontend.models.entities.DataObject;
import com.greenfoxacademy.restprojectfrontend.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

  private ExerciseRepository exerciseRepository;

  @Autowired
  public ExerciseServiceImpl(ExerciseRepository exerciseRepository) {
    this.exerciseRepository = exerciseRepository;
  }

  @Override
  public void saveData(String endpoint, String data) {
    exerciseRepository.save(new DataObject(endpoint,data));
  }

  @Override
  public Integer checkActionUntil(String action, DoUntil number) {
    if (action.equals("sum")) {
      return sumUntil(number.getUntil());
    }
    return factorUntil(number.getUntil());
  }

  @Override
  public Integer sumUntil(Integer action) {
    return action == 1 ? 1 : action + sumUntil(action - 1);
  }

  @Override
  public Integer factorUntil(Integer action) {
    return action == 1 ? 1 : action * sumUntil(action - 1);
  }

  @Override
  public Integer checkWhatWithNumbers(String what, Integer[] numbers) {
    return null;
  }

  @Override
  public Integer sumNumbers() {
    return null;
  }

  @Override
  public Integer multiplyNumbers() {
    return null;
  }

  @Override
  public Integer[] doubleNumbers() {
    return new Integer[0];
  }
}
