package com.example.javatimescheduler;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class Date extends androidx.appcompat.widget.AppCompatEditText {

    private String weekDates;

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

    private void init() {
        weekDates= "";
    }

    public void setWeekDates(String week) {
        super.setText(week);
    }

    public String getWeekDates() {
        return super.getText().toString();
    }

}
