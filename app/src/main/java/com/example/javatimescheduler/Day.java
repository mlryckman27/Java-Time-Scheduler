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


    public String getViewStart() {
        return viewStart.toString();
    }

    public void setViewStart(String startTime) {
        viewStart.setText(startTime);
    }

    public String getViewEnd() {

        return viewEnd.toString();
    }

    public void setViewEnd(String endTime) {
        viewEnd.setText(endTime);
    }

}
