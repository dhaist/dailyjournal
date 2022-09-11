package com.example.dailyjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView dailyMoodView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dailyMoodView = findViewById(R.id.moodTracker);
        ArrayList<EntryModel> courseModelArrayList = new ArrayList<EntryModel>();

        //new EntryModel getEntry from journal_entry.xml??
        //function to get what day it is, depending on day of the week, says which index starts at
        //check to see if first day of the month, then restart the gridview
        //get date as textview
        //get month
        courseModelArrayList.add(new EntryModel("Today was okay."));
        courseModelArrayList.add(new EntryModel("Today was good."));
        courseModelArrayList.add(new EntryModel("Today was great."));
        courseModelArrayList.add(new EntryModel("Today was sad."));
        courseModelArrayList.add(new EntryModel("Today was good."));
        courseModelArrayList.add(new EntryModel("Today was sad."));
        courseModelArrayList.add(new EntryModel("Today was okay."));

        courseModelArrayList.add(new EntryModel("Today was okay."));
        courseModelArrayList.add(new EntryModel("Today was good."));
        courseModelArrayList.add(new EntryModel("Today was great."));
        courseModelArrayList.add(new EntryModel("Today was sad."));
        courseModelArrayList.add(new EntryModel("Today was good."));
        courseModelArrayList.add(new EntryModel("Today was sad."));
        courseModelArrayList.add(new EntryModel("Today was okay."));

        EntryAdapter adapter = new EntryAdapter(this, courseModelArrayList);
        dailyMoodView.setAdapter(adapter);
    }
}

