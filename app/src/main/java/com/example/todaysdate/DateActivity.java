package com.example.todaysdate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DateActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_activity);

        TextView textView = findViewById(R.id.tv_date);
        Intent intent = getIntent();
        textView.setText("Today's Date is " + intent.getStringExtra("date"));
    }
}
