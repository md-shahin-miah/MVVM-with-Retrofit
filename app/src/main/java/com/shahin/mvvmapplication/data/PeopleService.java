
package com.shahin.mvvmapplication.data;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface PeopleService {

  @GET Observable<PeopleResponse> fetchPeople(@Url String url);
}
