package com.greenfoxacademy.connectionwithmysql.repositories;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findByIsDoneFalseAndIsUrgentTrue();
  List<Todo> findByIsDoneFalse();
  List<Todo> findByIsDoneTrue();
  List<Todo> findByIsUrgentTrue();
  List<Todo> findByIsUrgentFalse();
}
