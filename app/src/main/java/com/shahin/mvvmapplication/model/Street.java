

package com.shahin.mvvmapplication.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Street implements Serializable {

  @SerializedName("number") private String number;

  @SerializedName("name") private String name;

  public String getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }
}
