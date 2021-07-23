package com.example.javatimescheduler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Schedule {

    private Day[] startTimes;               // Start times for 7 days of the week
    private Day[] endTimes;                 // End times for 7 days of the week

    private Date week;


    public Schedule(Day[] startTimes, Day[] endTimes, Date week) {
        this.startTimes = startTimes;
        this.endTimes = endTimes;
        this.week = week;
    }

    public void saveSchedule(File pathToSchedule, String scheduleFileName) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter(new File(pathToSchedule, scheduleFileName)));

        bf.write(week.getWeekDates() + "\n");

        for (Day dayStart : startTimes) {
            bf.write(dayStart.getTime() + "\n");
        }

        for (Day dayEnd : endTimes) {
            bf.write(dayEnd.getTime() + "\n");
        }

        bf.close();
    }

    public void loadSchedule(File pathToSchedule, String scheduleFileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(pathToSchedule, scheduleFileName)));

        String weekDates = br.readLine();

        String[] start = new String[7];
        String[] end = new String[7];

        for (int i = 0; i < startTimes.length; i++) {
            start[i] = br.readLine();
        }

        for (int i = 0; i < endTimes.length; i++) {
            end[i] = br.readLine();
        }

        br.close();

        week.setWeekDates(weekDates);

        for (int i = 0; i < startTimes.length; i++) {
            startTimes[i].setTime(start[i]);
        }

        for (int i = 0; i < endTimes.length; i++) {
            endTimes[i].setTime(end[i]);
        }
    }

    public void clearSchedule() {
        week.setText("");

        for (Day dayStart : startTimes) {
            dayStart.setTime("");
        }

        for (Day dayEnd : endTimes) {
            dayEnd.setTime("");
        }
    }

    public String getWeek() {
        return week.getWeekDates();
    }

}
