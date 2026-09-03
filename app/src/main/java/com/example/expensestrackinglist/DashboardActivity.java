package com.example.expensestrackinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class DashboardActivity extends AppCompatActivity {

    private RecyclerView upcomingnrecyclerView;
    private RecyclerView transactionsrecyclerView;
    private FloatingActionButton addButton;
    private TextView spentText;
    private TextView monthText;
    private TextView greetingText;
    private TextView percentageText;
    private TextView amountSpentText;
    private TextView upComingText;
    private TextView recentTransactionsText;
    private EditText budgetInput;
    private TextView percentageAmount;
    private EditText amountSpent;

    private Button seeUpButton;
    private Button seeAllRTButton2;
    private ImageView homeButton, calendarButton, transactionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        upcomingnrecyclerView = findViewById(R.id.upcomingnrecyclerView);
        transactionsrecyclerView = findViewById(R.id.transactionsrecyclerView);
        addButton = findViewById(R.id.addButton);

        spentText = findViewById(R.id.textView7);
        monthText = findViewById(R.id.monthText);
        greetingText = findViewById(R.id.greetingText);
        percentageText = findViewById(R.id.percentageAmount);
        amountSpentText = findViewById(R.id.amountSpent);
        upComingText = findViewById(R.id.upComingText);
        recentTransactionsText = findViewById(R.id.recentTransactionsText);

        seeUpButton = findViewById(R.id.seeUpButton);
        seeAllRTButton2 = findViewById(R.id.seeAllRTButton2);
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

        addButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddExpenseActivity.class);
            startActivity(intent);
        });

        seeUpButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, CalendarActivity.class);
            startActivity(intent);
        });

        seeAllRTButton2.setOnClickListener(v -> {
            Intent intent = new Intent(this, ExpensesActivity.class);
            startActivity(intent);
        });




















    }





























}
