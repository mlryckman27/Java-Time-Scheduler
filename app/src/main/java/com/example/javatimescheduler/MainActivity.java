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
    //private EditText mondayStart;
    //private EditText mondayEnd;

    // TODO: instantiate weeklySchedule with 7 days of the week.  Add these fields to activity_main.xml
    Day monday;
    //ScheduleFile weeklySchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mondayStart = (EditText)findViewById(R.id.monday_start_time);
        //mondayEnd = (EditText)findViewById(R.id.monday_end_time);

        monday = new Day(R.id.monday_start_time, R.id.monday_end_time);  // **TODO: This line does not work.
        //weeklySchedule = new ScheduleFile(monday);

        //clearButtonListener();
        //saveButtonListener();
        //closeButtonListener();
    }


    // Button listener methods.

    // Clear button clears all the start/end time entries for the current schedule.
  //  private void clearButtonListener() {
      //  Button clearButton = (Button)findViewById(R.id.clear_button);
       // clearButton.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View v) {

                // TODO: Clear the schedule using ScheduleFile's clear() method.
                //mondayStart.setText("Start");
                //mondayEnd.setText("End");
            //}
        //});
    //}

    // TODO: Save all the start/end times for Monday - Friday in JTimeSched.txt.
    // Save button captures and stores all schedule data in a local file.
    //private void saveButtonListener() {
        //Button saveButton = (Button)findViewById(R.id.save_button);
        //saveButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {

                // TODO: Save the schedule using ScheduleFile's save() method.

              //  try {
                //    weeklySchedule.save();
                //} catch (IOException e) {
                  //  e.printStackTrace();
                //}
            //}
        //});
    //}

    // TODO: Look to see if there is a system class that will close the app.
    //private void closeButtonListener() {
        //Button closeButton = (Button)findViewById(R.id.close_button);
        //closeButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //try {
                    //loadSchedule();
                //} catch (IOException e) {
                    //e.printStackTrace();
                //}
            //}
        //});
    //}

    // TODO: load all start/end times for Monday - Sunday using ScheduleFile's load() method.
    //private void loadSchedule() throws IOException {

        // The file to be read, JTimeSched.txt (File() needs the path to its location).
        //File file = new File(getFilesDir() + File.separator, "JTimeSched.txt");

        // String to hold the start and end times of the shift
       // StringBuilder startEndTimes = new StringBuilder();

        // Create a buffered reader and line string to read data from JTimeSched.txt.
       // BufferedReader br = new BufferedReader(new FileReader(file));
        //String line;

        // Read all data from JTimeSched.txt until the next line is null.
        //while ((line = br.readLine()) != null) {
           // startEndTimes.append(line);
           // startEndTimes.append('\n');
       // }
       // br.close();

        // Set start/end times in schedule to the times from JTimeSched.txt.
        //mondayStart.setText(startEndTimes);
   // }





    /* TODO: General TODO List
     * 1. Implement saving of multiple schedules, so user can view/edit schedules from different weeks.
     * 2. Learn about onResume() method and load user's current schedule when app resumes.
     */

}