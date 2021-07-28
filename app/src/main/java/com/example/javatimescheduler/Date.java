/**
 * Matt Ryckman
 * SIE 508 - Summer 2021
 * Final Project - Java Time Scheduler
 * Due: July 29, 2021
 */

package com.example.javatimescheduler;

import android.content.Context;
import android.util.AttributeSet;

public class Date extends androidx.appcompat.widget.AppCompatEditText {

    private String weekDates;               // Start and end dates for a Schedule

    public Date(Context context) {
        super(context);
        init();
    }

    public Date(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Date(Context context, AttributeSet attrs, int defStyleAttrs) {
        super(context, attrs, defStyleAttrs);
        init();
    }

    /**
     * Initializes the weekDates with an empty string
     */
    private void init() {
        weekDates= "";
    }

    /**
     * @param week: Any valid string containing the start and end dates for a particular week
     */
    public void setWeekDates(String week) {
        super.setText(week);
    }

    /**
     * @return String representation of schedule's start/end dates
     */
    public String getWeekDates() {
        return super.getText().toString();
    }

}
