package com.example.javatimescheduler;


import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;


public class Day extends androidx.appcompat.widget.AppCompatEditText {

    private int[] hours;       // 0 - 23
    private int[] minutes;    // 0 - 59
    private String time;

    public Day(Context context) {
        super(context);
        init();
    }

    public Day(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        super.setText(time);
    }

    public Day(Context context, AttributeSet attrs, int defStyleAttrs) {
        super(context, attrs, defStyleAttrs);
        init();
    }

    private void init() {
        hours = new int[2];
        minutes = new int[2];

        hours[0] = 0;
        hours[1] = 0;
        minutes[0] = 0;
        minutes[1] = 0;

        time = hours[0] + hours[1] + ":" + minutes[0] + minutes[1];
    }

    private setHours(int hours) {

    }

    private setMinutes(int minutes) {

    }

    public void setTime(int hours, int minutes) {

    }

}
