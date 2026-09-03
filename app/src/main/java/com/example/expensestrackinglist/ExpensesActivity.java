package com.example.expensestrackinglist;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import java.util.ArrayList;



import androidx.appcompat.app.AppCompatActivity;

public class ExpensesActivity extends AppCompatActivity {

    private RecyclerView recurringBills;
    private RecyclerView oneTimeBills;
    private ImageView homeButton, calendarButton, transactionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);

        recurringBills = findViewById(R.id.recurringBills);
        oneTimeBills = findViewById(R.id.oneTimeBills);
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


        ArrayList<Bill> recurringList = new ArrayList<>();
        ArrayList<Bill> oneTimeList = new ArrayList<>();

        recurringList.add(new Bill("Netflix", "25 August 2026", 35));
        recurringList.add(new Bill("Spotify", "25 August 2026", 15));
        recurringList.add(new Bill("Internet","10 September 2026", 50));
        recurringList.add(new Bill("Canva Subscription", "25 August 2026", 15));
        recurringList.add(new Bill("Rent","1 January 2026", 3500));
        recurringList.add(new Bill("Netflix", "25 August 2026", 35));
        recurringList.add(new Bill("Spotify", "25 August 2026", 15));
        recurringList.add(new Bill("Internet","10 September 2026", 50));
        recurringList.add(new Bill("Canva Subscription", "25 August 2026", 15));
        recurringList.add(new Bill("Rent","1 January 2026", 3500));


        oneTimeList.add(new Bill("Car Insurance","1 January 2026",300));
        oneTimeList.add(new Bill("University Fees","23 March 2026",14000));
        oneTimeList.add(new Bill("House Insurance","10 January 2026",500));
        oneTimeList.add(new Bill("ChatGPT Subscription","23 May 2026",140));
        oneTimeList.add(new Bill("Car Insurance","1 January 2026",300));
        oneTimeList.add(new Bill("University Fees","23 March 2026",14000));
        oneTimeList.add(new Bill("House Insurance","10 January 2026",500));
        oneTimeList.add(new Bill("ChatGPT Subscription","23 May 2026",140));
        oneTimeList.add(new Bill("Car Insurance","1 January 2026",300));
        oneTimeList.add(new Bill("University Fees","23 March 2026",14000));
        oneTimeList.add(new Bill("House Insurance","10 January 2026",500));
        oneTimeList.add(new Bill("ChatGPT Subscription","23 May 2026",140));


        Bill_Adapter recurringAdapter = new Bill_Adapter(recurringList);
        Bill_Adapter oneTimeAdapter = new Bill_Adapter(oneTimeList);

        recurringBills.setLayoutManager(new LinearLayoutManager(this));
        recurringBills.setAdapter(recurringAdapter);
        recurringBills.setNestedScrollingEnabled(false);

        oneTimeBills.setLayoutManager(new LinearLayoutManager(this));
        oneTimeBills.setAdapter(oneTimeAdapter);
        oneTimeBills.setNestedScrollingEnabled(false);


    }
}
