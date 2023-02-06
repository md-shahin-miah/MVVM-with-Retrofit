

package com.shahin.mvvmapplication.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Location implements Serializable {

  @SerializedName("street") private Street street;

  @SerializedName("city") private String city;

  @SerializedName("state") private String state;

  public Street getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public void setStreet(Street street) {
    this.street = street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setState(String state) {
    this.state = state;
  }
}
