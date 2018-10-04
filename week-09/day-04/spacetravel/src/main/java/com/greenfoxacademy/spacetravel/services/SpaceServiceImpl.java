package com.greenfoxacademy.spacetravel.services;

import com.greenfoxacademy.spacetravel.models.Planet;
import com.greenfoxacademy.spacetravel.models.Spaceship;
import com.greenfoxacademy.spacetravel.repositories.PlanetRepository;
import com.greenfoxacademy.spacetravel.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceServiceImpl implements SpaceService {

  private PlanetRepository planetRepository;
  private SpaceshipRepository spaceshipRepository;

  @Autowired
  public SpaceServiceImpl(PlanetRepository planetRepository, SpaceshipRepository spaceshipRepository) {
    this.planetRepository = planetRepository;
    this.spaceshipRepository = spaceshipRepository;
  }

  @Override
  public List<Planet> getPlanets() {
    return planetRepository.findAll();
  }

  @Override
  public Spaceship getShip(Long id) {
    return spaceshipRepository.findById(id).get();
  }

  @Override
  public void moveShipToPlanet(Long shipId, Long planetId) {
    Spaceship ship = spaceshipRepository.findById(shipId).get();
    Planet planet = planetRepository.findById(planetId).get();
    String planetName = planet.getName();

    if (planetName.equals(ship.getPlanet())) {
      return;
    }

    ship.setPlanet(planetName);

    spaceshipRepository.save(ship);
  }
}
