package com.clock.pervasive.feedmeclock;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.PercentFormatter;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PieChart mChart = (PieChart) findViewById((R.id.pie_chart));
        float[] yData = { 20, 80};
        String[] xData = { "Missed", "Fed"};

        ArrayList<Entry> yVals1 = new ArrayList<Entry>();

        for (int i = 0; i < yData.length; i++)
            yVals1.add(new Entry(yData[i], i));

        ArrayList<String> xVals = new ArrayList<String>();

        for (int i = 0; i < xData.length; i++)
            xVals.add(xData[i]);

        PieDataSet dataSet = new PieDataSet(yVals1, "");

        // add many colors
        ArrayList<Integer> colors = new ArrayList<Integer>();

       // for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(Color.RED);

       // for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(Color.GREEN);
       // colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);

        // instantiate pie data object now
        PieData data = new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.GRAY);

        mChart.setCenterText("Feeding Stats");

        mChart.setData(data);
        mChart.setDescription("Feeding stats for past 6 months");

        // undo all highlights
        mChart.highlightValues(null);

        // update pie chart
        mChart.invalidate();
    }

}
