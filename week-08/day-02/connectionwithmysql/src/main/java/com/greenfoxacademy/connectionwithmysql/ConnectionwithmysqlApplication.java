package com.greenfoxacademy.connectionwithmysql;

    import com.greenfoxacademy.connectionwithmysql.models.Todo;
    import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

  @Autowired
  private TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Learn Object Relational Mapping"));
    todoRepository.save(new Todo("Play darts",false, true));
    todoRepository.save(new Todo("Go home and sleep", true, false));
    todoRepository.save(new Todo("Watch Frozen for the umpteenth time", true, false));
    todoRepository.save(new Todo("Be awesome at languages", true, true));
  }
}