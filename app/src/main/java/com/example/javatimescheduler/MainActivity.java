package com.example.javatimescheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Day mondayStart, tuesdayStart, wednesdayStart, thursdayStart, fridayStart;
    Day mondayEnd, tuesdayEnd, wednesdayEnd, thursdayEnd, fridayEnd;

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
    }

}