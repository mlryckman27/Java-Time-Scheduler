package com.javatimescheduler;

import android.content.Context;
import android.util.AttributeSet;

public class Day extends androidx.appcompat.widget.AppCompatEditText {

    private String time;                // String of the form "hh:mm" or "h:mm"; e.g. "08:15" or "8:15"

    public Day(Context context) {
        super(context);
        init();
    }

    public Day(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Day(Context context, AttributeSet attrs, int defStyleAttrs) {
        super(context, attrs, defStyleAttrs);
        init();
    }

    /**
     * Initialize the start or end time for a day as an empty string
     */
    private void init() {
        time = "";
    }

    /**
     * @param time: A string value representing the desired start or end time
     */
    public void setTime(String time) {
        super.setText(time);
    }

    /**
     * @return String representation of A Day's start or end time
     */
    public String getTime() {
        return super.getText().toString();
    }

}
