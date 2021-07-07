package com.example.javatimescheduler;

import android.content.Context;
import android.util.AttributeSet;

public class Day extends androidx.appcompat.widget.AppCompatEditText {

    private String time;

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

    private void init() {
        time = "start";
    }

    public void setTime(String time) {
        super.setText(time);
    }

    public String getTime() {
        return super.getText().toString();
    }

}
