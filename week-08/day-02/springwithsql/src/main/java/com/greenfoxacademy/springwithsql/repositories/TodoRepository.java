package com.greenfoxacademy.springwithsql.repositories;

import com.greenfoxacademy.springwithsql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
