package com.greenfoxacademy.spacetravel.controllers;

import com.greenfoxacademy.spacetravel.services.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpaceController {

  private SpaceService spaceService;
  private static final Long SHIP_ID = 1L;

  @Autowired
  public SpaceController(SpaceService spaceService) {
    this.spaceService = spaceService;
  }

  @GetMapping("")
  public String showIndex(Model model) {
    model.addAttribute("planets", spaceService.getPlanets());
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String moveToPlanet (@PathVariable(value = "id") Long planetId) {
    spaceService.moveShipToPlanet(SHIP_ID, planetId);
    return "index";
  }
}
