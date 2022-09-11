package com.example.dailyjournal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class EntryAdapter extends ArrayAdapter<EntryModel> {

    public EntryAdapter(@NonNull Context context, ArrayList<EntryModel> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.daily_mood, parent, false);
        }

        EntryModel entryModel = getItem(position);
        //ImageView dailyMood = listitemView.findViewById(R.id.circle);
        //dailyMood.setImageResource(R.drawable.solidcircle);

        TextView entry = listitemView.findViewById(R.id.dailyTV);
        entry.setText(entryModel.getEntry());
        return listitemView;
    }
}
