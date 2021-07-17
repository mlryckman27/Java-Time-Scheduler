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

        // Start/end dates for the work schedule
        Date scheduleDates = findViewById(R.id.date_edittext);

        // Instantiate a new weekly schedule with start/end times for each day and start/end dates.
        weeklySchedule = new Schedule(mondayStart, tuesdayStart, wednesdayStart, thursdayStart, fridayStart, saturdayStart, sundayStart,
                mondayEnd, tuesdayEnd, wednesdayEnd, thursdayEnd, fridayEnd, saturdayEnd, sundayEnd,
                scheduleDates);

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
            case R.id.load_menu_option:

            case R.id.save_menu_option:

            default:
                return false;

        }
//        switch(item.getItemId()) {
//            case R.id.week1_load:
//                //weeklySchedule.loadSchedule();
//            case R.id.week2_load:
//                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
//            case R.id.week3_load:
//                Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
//            case R.id.week4_load:
//                Toast.makeText(this, "Item 4 clicked", Toast.LENGTH_SHORT).show();
//            default:
//                return false;
//        }

    }


}