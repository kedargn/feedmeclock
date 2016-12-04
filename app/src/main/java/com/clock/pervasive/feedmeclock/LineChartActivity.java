package com.clock.pervasive.feedmeclock;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class LineChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LineChart lineChart = (LineChart)findViewById((R.id.line_chart));

        ArrayList<Entry> missedEntries = new ArrayList<Entry>();
        missedEntries.add(new Entry(70f,0));
        missedEntries.add(new Entry(60f,1));
        missedEntries.add(new Entry(45f,2));
        missedEntries.add(new Entry(40f,3));
        missedEntries.add(new Entry(30f,4));
        missedEntries.add(new Entry(20f,5));

        LineDataSet lineDataSet = new LineDataSet(missedEntries, "Missed");
        lineDataSet.setCircleColor(Color.RED);
        lineDataSet.setColor(Color.RED);

        ArrayList<String> labels = new ArrayList<String>();
        String[] months = {"June", "July", "Aug", "Sept", "Oct", "Nov"};

        for(String month : months)
        {
            labels.add(month);
        }

        LineData lineData = new LineData(labels, lineDataSet);




        ArrayList<Entry> fedEntries = new ArrayList<Entry>();
        fedEntries.add(new Entry(20f,0));
        fedEntries.add(new Entry(30f,1));
        fedEntries.add(new Entry(45f,2));
        fedEntries.add(new Entry(50f,3));
        fedEntries.add(new Entry(60f,4));
        fedEntries.add(new Entry(70f,5));

        LineDataSet fedLineDataSet = new LineDataSet(fedEntries, "Fed");
        fedLineDataSet.setCircleColor(Color.GREEN);
        fedLineDataSet.setColor(Color.GREEN);
        lineData.addDataSet(fedLineDataSet);
        lineChart.setData(lineData);





    }

}
