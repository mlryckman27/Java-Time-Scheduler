package com.example.javatimescheduler;

// TODO: make Schedule an interface, so ScheduleFile can implement it and inherit from AppCompactActivity.
public class Schedule {

    private Day monday;
    private Day tuesday;
    private Day wednesday;
    private Day thursday;
    private Day friday;
    private Day saturday;
    private Day sunday;


    public Schedule(Day monday, Day tuesday, Day wednesday, Day thursday, Day friday, Day saturday, Day sunday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }


    public Day getMonday() {
        return monday;
    }

    public void setMonday(Day monday) {
        this.monday = monday;
    }

    public Day getTuesday() {
        return tuesday;
    }

    public void setTuesday(Day tuesday) {
        this.tuesday = tuesday;
    }

    public Day getWednesday() {
        return wednesday;
    }

    public void setWednesday(Day wednesday) {
        this.wednesday = wednesday;
    }

    public Day getThursday() {
        return thursday;
    }

    public void setThursday(Day thursday) {
        this.thursday = thursday;
    }

    public Day getFriday() {
        return friday;
    }

    public void setFriday(Day friday) {
        this.friday = friday;
    }

    public Day getSaturday() {
        return saturday;
    }

    public void setSaturday(Day saturday) {
        this.saturday = saturday;
    }

    public Day getSunday() {
        return sunday;
    }

    public void setSunday(Day sunday) {
        this.sunday = sunday;
    }


    // TODO: Methods for parsing Day time to return start/end time separately.
    public String getMondayStartTime() {
        return monday.getViewStart().getText().toString();
    }

    public String getMondayEndTime() {
        return monday.getViewEnd().getText().toString();
    }

    public void setMondayStartTime(String startTime) {
        monday.getViewStart().setText(startTime);
    }

    public void setMondayEndTime(String endTime) {
        monday.getViewEnd().setText(endTime);
    }

}
