package com.clock.pervasive.feedmeclock;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TimePicker;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TimePicker meal1 = (TimePicker)findViewById(R.id.timePicker1);
        meal1.setHour(8);
        meal1.setMinute(00);

        TimePicker meal2 = (TimePicker)findViewById(R.id.timePicker2);
        meal2.setHour(15);
        meal2.setMinute(00);

        TimePicker meal3 = (TimePicker)findViewById(R.id.timePicker3);
        meal3.setHour(22);
        meal3.setMinute(00);



    }

}
