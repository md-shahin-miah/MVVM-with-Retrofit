

package com.shahin.mvvmapplication.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.shahin.mvvmapplication.R;
import com.shahin.mvvmapplication.databinding.PeopleDetailActivityBinding;
import com.shahin.mvvmapplication.model.People;
import com.shahin.mvvmapplication.viewmodel.PeopleDetailViewModel;

public class PeopleDetailActivity extends AppCompatActivity {

  private static final String EXTRA_PEOPLE = "EXTRA_PEOPLE";

  private PeopleDetailActivityBinding binding;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = DataBindingUtil.setContentView(this, R.layout.people_detail_activity);
    setSupportActionBar(binding.toolbar);
    displayHomeAsUpEnabled();
    getExtrasFromIntent();
  }

  public static Intent launchDetail(Context context, People people) {
    Intent intent = new Intent(context, PeopleDetailActivity.class);
    intent.putExtra(EXTRA_PEOPLE, people);
    return intent;
  }

  private void displayHomeAsUpEnabled() {
    ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
      actionBar.setDisplayHomeAsUpEnabled(true);
    }
  }

  private void getExtrasFromIntent() {
    People people = (People) getIntent().getSerializableExtra(EXTRA_PEOPLE);
    PeopleDetailViewModel peopleDetailViewModel = new PeopleDetailViewModel(people);
    binding.setPeopleDetailViewModel(peopleDetailViewModel);
    setTitle(people.getName().getTitle() + "." + people.getName().getFirst() + " " + people.getName().getLast());
  }
}
