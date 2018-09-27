package com.greenfoxacademy.foxclub.Services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.repositories.FoxRepository;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImpl implements FoxService {

  private FoxRepository foxRepository;

  public FoxServiceImpl(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  @Override
  public Fox findFox(String name) {
    return foxRepository.findByName();
  }
}

