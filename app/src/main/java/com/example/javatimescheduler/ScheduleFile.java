package com.example.javatimescheduler;


import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ScheduleFile extends AppCompatActivity {

    // The path the the file holding the schedule times.
    private File pathToScheduleFile;


    public ScheduleFile(Day monday) { //Day tuesday, Day wednesday, Day thursday, Day friday, Day saturday, Day sunday) {

        // 'data/data/app_package_name/filename' is where JTimeSchedule.txt is stored on the Android device.
        pathToScheduleFile = new File(getFilesDir() + File.separator + "JTimeSchedule.txt");

    }

}
