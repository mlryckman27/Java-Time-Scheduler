package com.example.javatimescheduler;


import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ScheduleFile {

    // The path the the file holding the schedule times.
    private File pathToScheduleFile;


    public ScheduleFile() {

        // 'data/data/app_package_name/filename' is where JTimeSchedule.txt is stored on the Android device.
        //  pass this to constructor from MainActivity. pathToScheduleFile = new File(getFilesDir() + File.separator + "JTimeSchedule.txt");

    }

}
