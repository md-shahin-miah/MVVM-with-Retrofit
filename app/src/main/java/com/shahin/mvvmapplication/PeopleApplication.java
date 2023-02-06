

package com.shahin.mvvmapplication;

import android.content.Context;


import androidx.multidex.MultiDexApplication;

import com.shahin.mvvmapplication.data.PeopleFactory;
import com.shahin.mvvmapplication.data.PeopleService;


import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class PeopleApplication extends MultiDexApplication {

  private PeopleService peopleService;
  private Scheduler scheduler;

  private static PeopleApplication get(Context context) {
    return (PeopleApplication) context.getApplicationContext();
  }

  public static PeopleApplication create(Context context) {
    return PeopleApplication.get(context);
  }

  public PeopleService getPeopleService() {
    if (peopleService == null) {
      peopleService = PeopleFactory.create();
    }

    return peopleService;
  }

  public Scheduler subscribeScheduler() {
    if (scheduler == null) {
      scheduler = Schedulers.io();
    }
    return scheduler;
  }
}
