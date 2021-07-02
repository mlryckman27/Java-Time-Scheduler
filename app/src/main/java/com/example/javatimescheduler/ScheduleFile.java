package com.example.javatimescheduler;


import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ScheduleFile extends AppCompatActivity {

    // The path the the file holding the schedule times.
    private File pathToScheduleFile;

    // 7 days of the week, each holding a start and end View that contains a time String.
    private Day monday, tuesday, wednesday, thursday, friday, saturday, sunday;


    public ScheduleFile(Day monday) { //Day tuesday, Day wednesday, Day thursday, Day friday, Day saturday, Day sunday) {

        // 'data/data/app_package_name/filename' is where JTimeSchedule.txt is stored on the Android device.
        pathToScheduleFile = new File(getFilesDir() + File.separator + "JTimeSchedule.txt");

        this.monday = monday;
        //this.tuesday = tuesday;
        //this.wednesday = wednesday;
        //this.thursday = thursday;
        //this.friday = friday;
        //this.saturday = saturday;
        //this.sunday = sunday;
    }

    public void setMondayStart(String startTime) {
        monday.setViewStart(startTime);
    }

    public void setMondayEnd(String endTime) {
        monday.setViewEnd(endTime);
    }

    // TODO: write setters for Tuesday - Sunday.

    public void save() throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter(pathToScheduleFile));

        bf.write(monday.getViewStart());
        bf.write(monday.getViewEnd());
        bf.write(tuesday.getViewStart());
        bf.write(wednesday.getViewStart());
        bf.write(wednesday.getViewEnd());
        bf.write(thursday.getViewStart());
        bf.write(thursday.getViewEnd());
        bf.write(friday.getViewStart());
        bf.write(friday.getViewEnd());
        bf.write(saturday.getViewStart());
        bf.write(saturday.getViewEnd());
        bf.write(sunday.getViewStart());
        bf.write(sunday.getViewEnd());

        bf.close();
    }
}
