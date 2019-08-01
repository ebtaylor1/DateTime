package com.example.todaysdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String strDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button get_date_button = findViewById(R.id.get_date_button);
        Date date = Calendar.getInstance().getTime();
        //Date Format

        DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = dateFormat.format(date);

        get_date_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DateActivity.class);
                intent.putExtra("date",strDate);
                startActivity(intent);
            }
        });

    }
}
