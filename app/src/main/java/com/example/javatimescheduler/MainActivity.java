package com.example.javatimescheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    /**
     * TODO:
     *
     * 1. Create create clickListeners for buttons
     *
     * 2. Implement save method to save the text field of each start/end View.
     *
     * 3. Implement load method to load the schedule into the start/end Views.
     */

    Day mondayStart, tuesdayStart, wednesdayStart, thursdayStart, fridayStart;
    Day mondayEnd, tuesdayEnd, wednesdayEnd, thursdayEnd, fridayEnd;

    Schedule weeklySchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mondayStart = findViewById(R.id.monday_start_edittext);
        tuesdayStart = findViewById(R.id.tuesday_start_edittext);
        wednesdayStart = findViewById(R.id.wednesday_start_edittext);
        thursdayStart = findViewById(R.id.thursday_start_edittext);
        fridayStart = findViewById(R.id.friday_start_edittext);

        mondayEnd = findViewById(R.id.monday_end_edittext);
        tuesdayEnd = findViewById(R.id.tuesday_end_edittext);
        wednesdayEnd = findViewById(R.id.wednesday_end_edittext);
        thursdayEnd = findViewById(R.id.thursday_end_edittext);
        fridayEnd = findViewById(R.id.friday_end_edittext);

        weeklySchedule = new Schedule(mondayStart, tuesdayStart, wednesdayStart, thursdayStart, fridayStart,
                mondayEnd, tuesdayEnd, wednesdayEnd, thursdayEnd, fridayEnd,
                getFilesDir() + File.separator + "schedule.txt");

        saveButtonListener();
    }

    // Save button captures and stores all schedule data in a local file.
    private void saveButtonListener() {
        Button saveButton = (Button)findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    weeklySchedule.saveSchedule();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }



}