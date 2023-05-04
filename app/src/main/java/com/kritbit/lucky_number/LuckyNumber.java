package com.kritbit.lucky_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LuckyNumber extends AppCompatActivity {
    String username;
    Intent user_data;
    TextView message;
    String msg_template = ", Here is your today's lucky number";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        user_data = getIntent();
        username = user_data.getStringExtra("username");
        message = findViewById(R.id.lucky_msg);
        message.setText(username+msg_template);


    }
}