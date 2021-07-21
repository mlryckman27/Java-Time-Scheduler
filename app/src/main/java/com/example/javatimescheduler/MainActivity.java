package com.example.javatimescheduler;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {


    /**
     * TODO:
     *
     * 1. Fix view constraints so layout is viewable on any size screen without issues (e.g. buttons cut off, start/end times not aligned).
     *
     * 2. Update Schedule class to contain two arrays of 7 days each (7 start times, 7 ends times in separate arrays).
     *      - constructor should take two array sof 7 days (7 start times, 7 end times)
     *
     * 3. Update menus to display the start/end dates of the week, rather than 'Week 1', 'Week 2', etc.
     *
     * 4. Create app icon.
     */
    // A weekly schedule holding user's work times.
    private Schedule weeklySchedule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup start time views
        Day mondayStart = findViewById(R.id.monday_start_edittext);
        Day tuesdayStart = findViewById(R.id.tuesday_start_edittext);
        Day wednesdayStart = findViewById(R.id.wednesday_start_edittext);
        Day thursdayStart = findViewById(R.id.thursday_start_edittext);
        Day fridayStart = findViewById(R.id.friday_start_edittext);
        Day saturdayStart = findViewById(R.id.saturday_start_edittext);
        Day sundayStart = findViewById(R.id.sunday_start_edittext);

        // Setup end time views
        Day mondayEnd = findViewById(R.id.monday_end_edittext);
        Day tuesdayEnd = findViewById(R.id.tuesday_end_edittext);
        Day wednesdayEnd = findViewById(R.id.wednesday_end_edittext);
        Day thursdayEnd = findViewById(R.id.thursday_end_edittext);
        Day fridayEnd = findViewById(R.id.friday_end_edittext);
        Day saturdayEnd = findViewById(R.id.saturday_end_edittext);
        Day sundayEnd = findViewById(R.id.sunday_end_edittext);

        Day[] dayStart = {mondayStart, tuesdayStart, wednesdayStart, thursdayStart, fridayStart, saturdayStart, sundayStart};
        Day[] dayEnd = {mondayEnd, tuesdayEnd, wednesdayEnd, thursdayEnd, fridayEnd, saturdayEnd, sundayEnd};

        // Start/end dates for the work schedule
        Date scheduleDates = findViewById(R.id.date_edittext);

        // Instantiate a new weekly schedule with start/end times for each day and start/end dates.
        weeklySchedule = new Schedule(dayStart, dayEnd, scheduleDates);

//        weeklySchedule = new Schedule(mondayStart, tuesdayStart, wednesdayStart, thursdayStart, fridayStart, saturdayStart, sundayStart,
//                mondayEnd, tuesdayEnd, wednesdayEnd, thursdayEnd, fridayEnd, saturdayEnd, sundayEnd,
//                scheduleDates);

        // Listen tap of clear button by user.
        clearButtonListener();

    }

    /**
     *
     * @param view
     */
    public void showPopupMenu(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    /**
     *
     * @param item
     * @return
     */
    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch(item.getItemId()) {
            case R.id.week1_load:
                try {
                    weeklySchedule.loadSchedule(getFilesDir(), "week1");
                    Toast.makeText(this, "Week 1 schedule loaded", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.week2_load:
                try {
                    weeklySchedule.loadSchedule(getFilesDir(), "week2");
                    Toast.makeText(this, "Week 2 schedule loaded", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.week3_load:
                try {
                    weeklySchedule.loadSchedule(getFilesDir(), "week3");
                    Toast.makeText(this, "Week 3 schedule loaded", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.week4_load:
                try {
                    weeklySchedule.loadSchedule(getFilesDir(), "week4");
                    Toast.makeText(this, "Week 4 schedule loaded", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case R.id.week1_save:
                try {
                    weeklySchedule.saveSchedule(getFilesDir(), "week1");
                    Toast.makeText(this, "Week 1 schedule saved", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.week2_save:
                try {
                    weeklySchedule.saveSchedule(getFilesDir(), "week2");
                    Toast.makeText(this, "Week 2 schedule saved", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.week3_save:
                try {
                    weeklySchedule.saveSchedule(getFilesDir(), "week3");
                    Toast.makeText(this, "Week 3 schedule saved", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.week4_save:
                try {
                    weeklySchedule.saveSchedule(getFilesDir(), "week4");
                    Toast.makeText(this, "Week 4 schedule saved", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            default:
                return false;

        }

        return false;
    }

    /**
     *
     */
    private void clearButtonListener() {
        Button clearButton = findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weeklySchedule.clearSchedule();
                //Toast.makeText(v.getContext(), "Schedule cleared", Toast.LENGTH_SHORT).show();
            }
        });
    }

}