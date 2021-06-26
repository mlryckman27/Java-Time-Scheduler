package com.example.javatimescheduler;


import androidx.appcompat.app.AppCompatActivity;

import java.io.File;


public class ScheduleFile extends AppCompatActivity {


    File pathToScheduleFile;


    public ScheduleFile() {
        pathToScheduleFile = new File(getFilesDir() + File.separator + "JTimeSchedule.txt");
    }

}
