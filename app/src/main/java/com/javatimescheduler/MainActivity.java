package com.javatimescheduler;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    // A weekly schedule holding user's work times.
    private Schedule weeklySchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup start times
        Day mondayStart = findViewById(R.id.monday_start_edittext);
        Day tuesdayStart = findViewById(R.id.tuesday_start_edittext);
        Day wednesdayStart = findViewById(R.id.wednesday_start_edittext);
        Day thursdayStart = findViewById(R.id.thursday_start_edittext);
        Day fridayStart = findViewById(R.id.friday_start_edittext);
        Day saturdayStart = findViewById(R.id.saturday_start_edittext);
        Day sundayStart = findViewById(R.id.sunday_start_edittext);

        // Setup end times
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

        // Listen tap of clear button by user.
        clearButtonListener();

        // Listen for tap of delete button by user.
        deleteButtonListener();
    }


    /**
     * Displays a popupmenu with two submenus for user tp select a schedule to save or load
     */
    public void showPopupMenu(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();

        // Popup submenus for loading and saving the schedule
        Menu loadLabels = popup.getMenu().getItem(0).getSubMenu();
        Menu saveLabels = popup.getMenu().getItem(1).getSubMenu();

        // Set title for each submenu item to the dates associated with the filename
        try {
            loadLabels.getItem(0).setTitle(updatePopupMenuItem("week1"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            loadLabels.getItem(1).setTitle(updatePopupMenuItem("week2"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            loadLabels.getItem(2).setTitle(updatePopupMenuItem("week3"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            loadLabels.getItem(3).setTitle(updatePopupMenuItem("week4"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            saveLabels.getItem(0).setTitle(updatePopupMenuItem("week1"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            saveLabels.getItem(1).setTitle(updatePopupMenuItem("week2"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            saveLabels.getItem(2).setTitle(updatePopupMenuItem("week3"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            saveLabels.getItem(3).setTitle(updatePopupMenuItem("week4"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param item: One of eight clickable Views among the save and load submenus
     * @return false, if no items are clicked or user clicks outside the popupmenu context
     */
    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch(item.getItemId()) {

            // Load schedule submenu cases
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

            // Save schedule submenu cases
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
     * @param fileName: "week1", "week2", "week3", or "week4"
     * @return Start and end dates for the week to be saved to the save/load menu
     * @throws IOException
     */
    private String updatePopupMenuItem(String fileName) throws IOException {
        File weekFile = new File(getFilesDir(), fileName);
        if (!weekFile.canRead()) {
            return "Empty";
        }

        BufferedReader br = new BufferedReader(new FileReader(weekFile));

        String weekLabel = br.readLine();
        br.close();

        if (weekLabel.equals("")) {
            weekLabel = "Empty";
        }

        return weekLabel;
    }

    /**
     * Calls Schedule's clearSchedule() method to clear currently loaded weeklySchedule.
     * This does not delete the current weeklySchedule from the save/load menu.
     */
    private void clearButtonListener() {
        Button clearButton = findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weeklySchedule.clearSchedule();
                Toast.makeText(v.getContext(), "Schedule cleared", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * Calls Schedule's clearSchedule() method, then calls saveSchedule() method to completely
     * remove the current weekly schedule from the save/load menu.
     */
    private void deleteButtonListener() {
        Button deleteButton = findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    BufferedReader week1File = new BufferedReader(new FileReader(new File(getFilesDir(), "week1")));
                    if (week1File.readLine().equals(weeklySchedule.getWeek())) {
                        Toast.makeText(v.getContext(), "Deleted " + weeklySchedule.getWeek() + " schedule", Toast.LENGTH_SHORT).show();
                        weeklySchedule.clearSchedule();
                        weeklySchedule.saveSchedule(getFilesDir(), "week1");
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    BufferedReader week2File = new BufferedReader(new FileReader(new File(getFilesDir(), "week2")));
                    if (week2File.readLine().equals(weeklySchedule.getWeek())) {
                        Toast.makeText(v.getContext(), "Deleted " + weeklySchedule.getWeek() + " schedule", Toast.LENGTH_SHORT).show();
                        weeklySchedule.clearSchedule();
                        weeklySchedule.saveSchedule(getFilesDir(), "week2");
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    BufferedReader week3File = new BufferedReader(new FileReader(new File(getFilesDir(), "week3")));
                    if (week3File.readLine().equals(weeklySchedule.getWeek())) {
                        Toast.makeText(v.getContext(), "Deleted " + weeklySchedule.getWeek() + " schedule", Toast.LENGTH_SHORT).show();
                        weeklySchedule.clearSchedule();
                        weeklySchedule.saveSchedule(getFilesDir(), "week3");
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    BufferedReader week4File = new BufferedReader(new FileReader(new File(getFilesDir(), "week4")));
                    if (week4File.readLine().equals(weeklySchedule.getWeek())) {
                        Toast.makeText(v.getContext(), "Deleted " + weeklySchedule.getWeek() + " schedule", Toast.LENGTH_SHORT).show();
                        weeklySchedule.clearSchedule();
                        weeklySchedule.saveSchedule(getFilesDir(), "week4");
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}