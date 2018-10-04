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
    model.addAttribute("ship", spaceService.getShip(SHIP_ID));
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String moveToPlanet (@PathVariable(value = "id") Long planetId) {
    spaceService.moveShipToPlanet(SHIP_ID, planetId);
    return "index";
  }

  @GetMapping("/toship/{id}")
  public String movePeopleToShip(@PathVariable(value = "id") Long planetId) {
    spaceService.movePeopleToShip(SHIP_ID, planetId);
    return "index";
  }

  @GetMapping("/toplanet/{id}")
  public String movePeopleToPlanet(@PathVariable(value = "id") Long planetId) {
    spaceService.movePeopleToPlanet(SHIP_ID, planetId);
    return "index";
  }
}
