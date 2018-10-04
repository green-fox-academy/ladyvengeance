package com.greenfoxacademy.spacetravel.services;

import com.greenfoxacademy.spacetravel.repositories.PlanetRepository;
import com.greenfoxacademy.spacetravel.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpaceServiceImpl implements SpaceService {

  private PlanetRepository planetRepository;
  private SpaceshipRepository spaceshipRepository;

  @Autowired
  public SpaceServiceImpl(PlanetRepository planetRepository, SpaceshipRepository spaceshipRepository) {
    this.planetRepository = planetRepository;
    this.spaceshipRepository = spaceshipRepository;
  }
}
