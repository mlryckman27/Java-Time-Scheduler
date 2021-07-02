package com.example.javatimescheduler;


import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Day extends AppCompatActivity {

    private EditText viewStart;     // The View for the start time for the day.
    private EditText viewEnd;       // The View for the end time for the day.


    // Id is of the form R.id.some_xml_label
    public Day(int startId, int endId) {
        viewStart = findViewById(startId);
        viewEnd = findViewById(endId);
    }


    // Return the start View's text field as a String
    public String getViewStart() {
        return viewStart.toString();
    }

    // Set the start View's text field to a specified time (hh:mm or h:mm format)
    public void setViewStart(String startTime) {
        viewStart.setText(startTime);
    }

    // Return the end View's text field as a String
    public String getViewEnd() {
        return viewEnd.toString();
    }

    // Set the end View's text field to a specified time (hh:mm or h:mm format)
    public void setViewEnd(String endTime) {
        viewEnd.setText(endTime);
    }

}
