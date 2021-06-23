package com.example.javatimescheduler;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    // EditText fields for start/end times for each day.
    private EditText mondayStart;
    private EditText mondayEnd;

    // File for storing schedule information.
   // private File scheduleFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mondayStart = (EditText)findViewById(R.id.monday_start_time);
        mondayEnd = (EditText)findViewById(R.id.monday_end_time);

        if (mondayStart.getText() == null && mondayEnd.getText() == null) {
            try {
                loadSchedule();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        clearButtonListener();
        saveButtonListener();
    }


    // Button listener methods.

    // Clear button clears all the start/end time entries for the current schedule.
    private void clearButtonListener() {
        Button clearButton = (Button)findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mondayStart.setText("Start");
                mondayEnd.setText("End");
            }
        });
    }

    // Save button captures and stores all schedule data in a local file.
    private void saveButtonListener() {
        Button saveButton = (Button)findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Start/end times for Monday's schedule.
                String mondaySchedule = mondayStart.getText().toString() + " " + mondayEnd.getText().toString();

                // A writable text file to hold start/end times.
                BufferedWriter bufferedWriter = null;
                try {
                    // Instantiate the bufferedWriter with a path to the file 'data/data/app_package_name/filename'.
                    bufferedWriter = new BufferedWriter(new FileWriter(new File(getFilesDir() + File.separator + "JTimeSched.txt")));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    // Write the start/end times to the bufferedWriter text file.
                    bufferedWriter.write(mondaySchedule);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // TODO: Loading the schedule into the EditText fields doesn't work yet.
    private void loadSchedule() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(getFilesDir() + File.separator + "JTimeSched.txt")));
        String read;
        StringBuilder builder = new StringBuilder("");

        while ((read = bufferedReader.readLine()) != null) {
            builder.append(read);
        }

        Log.d("Output", builder.toString());
        bufferedReader.close();
    }

}