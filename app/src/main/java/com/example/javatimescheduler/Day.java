package com.example.javatimescheduler;


import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Day extends AppCompatActivity {

    private EditText viewStart;     // The start time for the day.
    private EditText viewEnd;       // The end time for the day.


    // Id is of the form R.id.some_xml_label
    public Day(int startId, int endId) {
        viewStart = findViewById(startId);
        viewEnd = findViewById(endId);
    }


    public EditText getViewStart() {
        return viewStart;
    }

    public void setViewStart(EditText viewStart) {
        this.viewStart = viewStart;
    }

    public EditText getViewEnd() {
        return viewEnd;
    }

    public void setViewEnd(EditText viewEnd) {
        this.viewEnd = viewEnd;
    }
}
