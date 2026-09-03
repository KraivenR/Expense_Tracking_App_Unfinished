package com.example.expensestrackinglist;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

public class AddExpenseActivity extends AppCompatActivity {

    private ImageView closeButton;
    private EditText amountInput;
    private TextView textView3;
    private Button saveExpenseButton;
    private EditText editTextDate;
    private EditText descriptionInput;
    private TextView textView5;
    private TextView textView6;
    private Button cardButton;
    private Button cashButton;
    private Button TransferButton;
    private TextView textView20;
    private Button onceButton;
    private Button repeats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        closeButton = findViewById(R.id.closeButton);
        amountInput = findViewById(R.id.amountInput);
        textView3 = findViewById(R.id.textView3);
        saveExpenseButton = findViewById(R.id.saveExpenseButton);
        editTextDate = findViewById(R.id.editTextDate);
        descriptionInput = findViewById(R.id.descriptionInput);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);

        cardButton = findViewById(R.id.cardButton);
        cashButton = findViewById(R.id.cashButton);
        TransferButton = findViewById(R.id.TransferButton);
        onceButton = findViewById(R.id.onceButton);
        repeats = findViewById(R.id.repeats);

        closeButton.setOnClickListener(v -> finish());
    }
}
