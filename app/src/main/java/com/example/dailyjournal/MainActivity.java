package com.example.dailyjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView newCalView = (CalendarView) findViewById(R.id.calendarView);
        newCalView.setBackgroundColor(getColor(R.color.sage));

    }


}