package com.example.javatimescheduler;


import androidx.appcompat.app.AppCompatActivity;

import java.io.File;


public class ScheduleFile extends AppCompatActivity {


    private File pathToScheduleFile;
    private Day monday, tuesday, wednesday, thursday, friday, saturday, sunday;


    public ScheduleFile(Day monday, Day tuesday, Day wednesday, Day thursday, Day friday, Day saturday, Day sunday) {
        pathToScheduleFile = new File(getFilesDir() + File.separator + "JTimeSchedule.txt");

        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    public void setMondayStart(String startTime) {
        monday.setViewStart(startTime);
    }

}
