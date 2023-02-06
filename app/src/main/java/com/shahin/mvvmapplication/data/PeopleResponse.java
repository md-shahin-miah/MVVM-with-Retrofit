

package com.shahin.mvvmapplication.data;

import com.google.gson.annotations.SerializedName;
import com.shahin.mvvmapplication.model.People;

import java.util.List;


public class PeopleResponse {

    @SerializedName("results")
    private List<People> peopleList;

    public List<People> getPeopleList() {
        return peopleList;
    }
}
