package com.javatimescheduler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Schedule {

    private Day[] startTimes;               // Start times for 7 days of the week
    private Day[] endTimes;                 // End times for 7 days of the week

    private Date week;                      // Start and end dates for current schedule


    /**
     * @param startTimes: 7-element array of Days holding start time data for those days
     * @param endTimes: 7-element array of Days holding end time data for those days
     * @param week: A Date object holding the week's start and end dates.
     */
    public Schedule(Day[] startTimes, Day[] endTimes, Date week) {
        this.startTimes = startTimes;
        this.endTimes = endTimes;
        this.week = week;
    }

    /**
     * @param pathToSchedule: Should always be found using getFilesDir()
     * @param scheduleFileName: "week1", "week2", "week3", or "week4"
     * @throws IOException
     */
    public void saveSchedule(File pathToSchedule, String scheduleFileName) throws IOException {

        // BufferedWriter will be used to write each value to the schedule file
        BufferedWriter bf = new BufferedWriter(new FileWriter(new File(pathToSchedule, scheduleFileName)));

        // First line of the schedule file will always be written as the schedule's start/end dates
        bf.write(week.getWeekDates() + "\n");

        // Write all start times to the schedule file
        for (Day dayStart : startTimes) {
            bf.write(dayStart.getTime() + "\n");
        }

        // Write all end times to the schedule file
        for (Day dayEnd : endTimes) {
            bf.write(dayEnd.getTime() + "\n");
        }

        bf.close();
    }

    /**
     * @param pathToSchedule: Should always be found using getFilesDir()
     * @param scheduleFileName: "week1", "week2", "week3", or "week4"
     * @throws IOException
     */
    public void loadSchedule(File pathToSchedule, String scheduleFileName) throws IOException {

        // BufferedReader will be used to read each line of the schedule file
        BufferedReader br = new BufferedReader(new FileReader(new File(pathToSchedule, scheduleFileName)));

        // Schedule dates are always the first line of the file
        String weekDates = br.readLine();

        // Will hold start/end times for each day
        String[] start = new String[7];
        String[] end = new String[7];

        // Read all the start times
        for (int i = 0; i < startTimes.length; i++) {
            start[i] = br.readLine();
        }

        // Read all the end times
        for (int i = 0; i < endTimes.length; i++) {
            end[i] = br.readLine();
        }

        br.close();

        // Set the schedule's start/end dates for user to see in MainActivity
        week.setWeekDates(weekDates);

        // Set all the start times for user to see in MainActivity
        for (int i = 0; i < startTimes.length; i++) {
            startTimes[i].setTime(start[i]);
        }

        // Set all the end times for user to see in MainActivity
        for (int i = 0; i < endTimes.length; i++) {
            endTimes[i].setTime(end[i]);
        }
    }

    /**
     * Clears all the fields of the schedule, so user can have a fresh start.
     */
    public void clearSchedule() {
        week.setText("");

        for (Day dayStart : startTimes) {
            dayStart.setTime("");
        }

        for (Day dayEnd : endTimes) {
            dayEnd.setTime("");
        }
    }

    /**
     * @return A string representation of the schedule's start/end dates.
     */
    public String getWeek() {
        return week.getWeekDates();
    }

}
