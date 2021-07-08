package com.example.javatimescheduler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Schedule {

    private Day monStart, tueStart, wedStart, thuStart, friStart;
    private Day monEnd, tueEnd, wedEnd, thuEnd, friEnd;
    private File scheduleFile;

    public Schedule(Day monStart, Day tueStart, Day wedStart, Day thuStart, Day friStart,
                    Day monEnd, Day tueEnd, Day wedEnd, Day thuEnd, Day friEnd,
                    String filePath) {

        this.monStart = monStart;
        this.tueStart = tueStart;
        this.wedStart = wedStart;
        this.thuStart = thuStart;
        this.friStart = friStart;

        this.monEnd = monEnd;
        this.tueEnd = tueEnd;
        this.wedEnd = wedEnd;
        this.thuEnd = thuEnd;
        this.friEnd = friEnd;

        scheduleFile = new File(filePath);      // filePath should be getFileDir() + File.separator + "schedule.txt"
    }



    public void saveSchedule() throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter(scheduleFile));

        bf.write(monStart.getTime() + " ");
        bf.write(tueStart.getTime() + " ");
        bf.write(wedStart.getTime() + " ");
        bf.write(thuStart.getTime() + " ");
        bf.write(friStart.getTime() + " ");

        bf.write("\n");

        bf.write(monEnd.getTime() + " ");
        bf.write(tueEnd.getTime() + " ");
        bf.write(wedEnd.getTime() + " ");
        bf.write(thuEnd.getTime() + " ");
        bf.write(friEnd.getTime() + " ");

        bf.close();
    }

    //public void loadSchedule() { }


}
