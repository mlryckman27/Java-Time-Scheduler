package com.example.javatimescheduler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    /**
     * TODO:
     *
     * 1. Implement save method to save date along with days' start/end times in a unique file with date as file descriptor
     *      - Date will need to be made into custom Scrollable EditText class
     *      - Add Date to Schedule class
     *      - Date should be instantiated in MainActivity and passed to Schedule's constructor.
     *
     * 2. Implement load method to load user's selected file from a list of schedules in the local app directory.
     *      - populates the Date field with the start/end dates and the Days with start/end times from the selected file.
     *
     * 3. Connect Close Button and implement method to close app.
     *
     * 4. Connect Clear Button and implement method to clear all fields.
     *
     * 5. Create and connect New Button to prompt user to input name of new schedule and enter new start/end times.
     *
     */

    Day mondayStart, tuesdayStart, wednesdayStart, thursdayStart, fridayStart, saturdayStart, sundayStart;
    Day mondayEnd, tuesdayEnd, wednesdayEnd, thursdayEnd, fridayEnd, saturdayEnd, sundayEnd;
    Date scheduleDates;

    RecyclerView scheduleList;

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
        saturdayStart = findViewById(R.id.saturday_start_edittext);
        sundayStart = findViewById(R.id.sunday_start_edittext);

        mondayEnd = findViewById(R.id.monday_end_edittext);
        tuesdayEnd = findViewById(R.id.tuesday_end_edittext);
        wednesdayEnd = findViewById(R.id.wednesday_end_edittext);
        thursdayEnd = findViewById(R.id.thursday_end_edittext);
        fridayEnd = findViewById(R.id.friday_end_edittext);
        saturdayEnd = findViewById(R.id.saturday_end_edittext);
        sundayEnd = findViewById(R.id.sunday_end_edittext);

        scheduleDates = findViewById(R.id.date_edittext);

        scheduleList = findViewById(R.id.schedule_list_recycler);

        weeklySchedule = new Schedule(mondayStart, tuesdayStart, wednesdayStart, thursdayStart, fridayStart, saturdayStart, sundayStart,
                mondayEnd, tuesdayEnd, wednesdayEnd, thursdayEnd, fridayEnd, saturdayEnd, sundayEnd,
                scheduleDates);

        saveButtonListener();
        loadButtonListener();
    }

    // Save button captures and stores all schedule data in a local file.
    private void saveButtonListener() {
        Button saveButton = (Button)findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String pathToSchedule = getFilesDir() + File.separator + scheduleDates.getWeek();
                //String pathToSchedule = getFilesDir() + File.separator + "JTimeSchedule.txt";

                try {
                    weeklySchedule.saveSchedule(getFilesDir(), weeklySchedule.getWeek().toString().replace('/', '.'));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void loadButtonListener() {
        Button loadButton = (Button)findViewById(R.id.load_button);
        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



}