

package com.shahin.mvvmapplication.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Picture implements Serializable {

  @SerializedName("large") private String large;

  @SerializedName("medium") private String medium;

  public String getLarge() {
    return large;
  }

  public void setLarge(String large) {
    this.large = large;
  }

  public String getMedium() {
    return medium;
  }
}
