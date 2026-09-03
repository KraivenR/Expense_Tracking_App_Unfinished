package com.example.expensestrackinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarActivity extends AppCompatActivity {


    private RecyclerView upcomingBillsViewer;
    private GridLayout calendarGrid;
    private ImageView rewindBtn;
    private ImageView advanceBtn;
    private TextView allMonths;
    private ImageView homeButton, calendarButton, transactionButton;
    private Calendar currentMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        advanceBtn = findViewById(R.id.advanceBtn);
        rewindBtn = findViewById(R.id.rewindBtn);
        allMonths = findViewById(R.id.allMonths);
        calendarGrid = findViewById(R.id.calendarGrid);
        upcomingBillsViewer = findViewById(R.id.upcomingBillsViewer);
        homeButton = findViewById(R.id.homeButton);
        calendarButton = findViewById(R.id.calendarButton);
        transactionButton = findViewById(R.id.transactionButton);

        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
        });
        calendarButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, CalendarActivity.class);
            startActivity(intent);
        });
        transactionButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, ExpensesActivity.class);
            startActivity(intent);
        });

        currentMonth = Calendar.getInstance();

            updateCalendar();

        rewindBtn.setOnClickListener(v -> {
        currentMonth.add(Calendar.MONTH, -1);
            updateCalendar();
        });

        advanceBtn.setOnClickListener(v ->{
        currentMonth.add(Calendar.MONTH, +1);
            updateCalendar();
        });
    }

    private void updateCalendar() {

        calendarGrid.removeAllViews();

        String monthName = new SimpleDateFormat("MMMM", Locale.getDefault()).format(currentMonth.getTime());

        int year = currentMonth.get(Calendar.YEAR);

        allMonths.setText(monthName + " " + year);

        // Calendar used to calculate the days
        Calendar calendar = (Calendar) currentMonth.clone();

        calendar.set(Calendar.DAY_OF_MONTH, 1);

        int firstDayOfMonth = currentMonth.get(Calendar.DAY_OF_WEEK);

        //int startingPosition = firstDayOfWeek - calendarMonday;

        //if(startingPosition<0){
        //    startingPosition+=7;
        }

       // int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        Calendar today = Calendar.getInstance();

        int todayDay = today.get(Calendar.DAY_OF_MONTH);
        int todayMonth = today.get(Calendar.MONTH);
        int todayYear = today.get(Calendar.YEAR);












    }











