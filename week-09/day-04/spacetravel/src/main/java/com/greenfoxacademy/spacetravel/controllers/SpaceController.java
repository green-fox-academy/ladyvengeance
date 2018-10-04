package com.greenfoxacademy.spacetravel.controllers;

import com.greenfoxacademy.spacetravel.services.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpaceController {

  private SpaceService spaceService;

  @Autowired
  public SpaceController(SpaceService spaceService) {
    this.spaceService = spaceService;
  }

  @GetMapping("")
  public String showIndex() {
    return "index";
  }
}
