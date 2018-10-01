package com.greenfoxacademy.restprojectfrontend.controllers;

import com.greenfoxacademy.restprojectfrontend.models.dtos.AppendA;
import com.greenfoxacademy.restprojectfrontend.models.dtos.ErrorClass;
import com.greenfoxacademy.restprojectfrontend.models.dtos.Input;
import com.greenfoxacademy.restprojectfrontend.models.dtos.Message;
import com.greenfoxacademy.restprojectfrontend.services.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  private ExerciseService exerciseService;

  @Autowired
  public MainRestController(ExerciseService exerciseService) {
    this.exerciseService = exerciseService;
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> doubleInput(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.status(HttpStatus.OK).body(new ErrorClass("Please provide an input!"));
    }
//    exerciseService.saveData("/doubling", "input=" + input);
    return ResponseEntity.status(HttpStatus.OK).body(new Input(input));
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greeterFunction(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return ResponseEntity.status(HttpStatus.OK).body(new ErrorClass("Please provide a name!"));
    } else if (title == null) {
      return ResponseEntity.status(HttpStatus.OK).body(new ErrorClass("Please provide a title!"));
    }
    return ResponseEntity.status(HttpStatus.OK).body(new Message(name, title));
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appendA(@PathVariable(value = "appendable") String appendable) {
    return ResponseEntity.status(HttpStatus.OK).body(new AppendA(appendable));
  }

  @GetMapping("/appenda")
  public ResponseEntity<?> noAppendableProvided() {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorClass("Not found"));
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable(value = "action") String action) {
    return
  }
}
