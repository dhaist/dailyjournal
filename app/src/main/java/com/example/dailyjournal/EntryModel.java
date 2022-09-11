package com.example.dailyjournal;

import android.widget.ImageView;

public class EntryModel {

    //variable for daily journal entries
    private String entry;
    private ImageView mood;

    public EntryModel(String entry){
        this.entry = entry;
    }

    String getEntry(){
        return entry;
    }

    ImageView getMood() {
        return mood;
    }

    void setEntry(String entry){
        this.entry = entry;
    }

    void setMood(ImageView mood){
        this.mood = mood;
    }
}
