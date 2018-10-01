package com.greenfoxacademy.restprojectfrontend.services;

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
}
