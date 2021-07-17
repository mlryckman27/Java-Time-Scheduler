package com.example.javatimescheduler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Schedule {

    private Day monStart, tueStart, wedStart, thuStart, friStart, satStart, sunStart;
    private Day monEnd, tueEnd, wedEnd, thuEnd, friEnd, satEnd, sunEnd;
    //private File scheduleFile;

    public Schedule(Day monStart, Day tueStart, Day wedStart, Day thuStart, Day friStart, Day satStart, Day sunStart,
                    Day monEnd, Day tueEnd, Day wedEnd, Day thuEnd, Day friEnd, Day satEnd, Day sunEnd) {

        this.monStart = monStart;
        this.tueStart = tueStart;
        this.wedStart = wedStart;
        this.thuStart = thuStart;
        this.friStart = friStart;
        this.satStart = satStart;
        this.sunStart = sunStart;

        this.monEnd = monEnd;
        this.tueEnd = tueEnd;
        this.wedEnd = wedEnd;
        this.thuEnd = thuEnd;
        this.friEnd = friEnd;
        this.satEnd = satEnd;
        this.sunEnd = sunEnd;

        //scheduleFile = new File(filePath);      // filePath should be getFileDir() + File.separator + "schedule.txt"
    }



    public void saveSchedule(File scheduleFile) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter(scheduleFile));

        bf.write(monStart.getTime() + "\n");
        bf.write(tueStart.getTime() + "\n");
        bf.write(wedStart.getTime() + "\n");
        bf.write(thuStart.getTime() + "\n");
        bf.write(friStart.getTime() + "\n");

        bf.write(monEnd.getTime() + "\n");
        bf.write(tueEnd.getTime() + "\n");
        bf.write(wedEnd.getTime() + "\n");
        bf.write(thuEnd.getTime() + "\n");
        bf.write(friEnd.getTime() + "\n");

        bf.close();
    }

    public void loadSchedule(File scheduleFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(scheduleFile));

        String monStartTime = br.readLine();
        String tueStartTime = br.readLine();
        String wedStartTime = br.readLine();
        String thuStartTime = br.readLine();
        String friStartTime = br.readLine();

        String monEndTime = br.readLine();
        String tueEndTime = br.readLine();
        String wedEndTime = br.readLine();
        String thuEndTime = br.readLine();
        String friEndTime = br.readLine();

        br.close();

        monStart.setTime(monStartTime);
        tueStart.setTime(tueStartTime);
        wedStart.setTime(wedStartTime);
        thuStart.setTime(thuStartTime);
        friStart.setTime(friStartTime);

        monEnd.setTime(monEndTime);
        tueEnd.setTime(tueEndTime);
        wedEnd.setTime(wedEndTime);
        thuEnd.setTime(thuEndTime);
        friEnd.setTime(friEndTime);
    }

}
