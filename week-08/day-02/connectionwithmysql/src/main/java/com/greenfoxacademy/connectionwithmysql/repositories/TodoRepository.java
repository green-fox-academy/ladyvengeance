package com.greenfoxacademy.connectionwithmysql.repositories;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAll();
  List<Todo> findByIsDoneAndIsUrgent(boolean isDone, boolean isUrgent);
  List<Todo> findByIsDone(boolean isDone);
  List<Todo> findByIsUrgent(boolean isUrgent);
}
