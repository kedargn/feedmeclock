package com.clock.pervasive.feedmeclock;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onPieChart(View v){
        Intent intent = new Intent(this, PieChartActivity.class);
        startActivity(intent);
    }

    public void onLineChart(View v){
        Intent intent = new Intent(this, LineChartActivity.class);
        startActivity(intent);
    }


}
