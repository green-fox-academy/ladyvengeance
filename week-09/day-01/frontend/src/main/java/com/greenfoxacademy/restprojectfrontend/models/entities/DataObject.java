package com.greenfoxacademy.restprojectfrontend.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataObject {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String endpoint;
  private String data;

  public DataObject() {
  }

  public DataObject(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
