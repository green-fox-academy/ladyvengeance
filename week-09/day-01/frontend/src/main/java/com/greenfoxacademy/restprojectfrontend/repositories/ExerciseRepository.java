package com.greenfoxacademy.restprojectfrontend.repositories;

import com.greenfoxacademy.restprojectfrontend.models.entities.DataObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends CrudRepository<DataObject, Long> {
}
