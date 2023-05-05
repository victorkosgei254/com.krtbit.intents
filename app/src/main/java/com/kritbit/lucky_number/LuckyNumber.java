package com.kritbit.lucky_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class LuckyNumber extends AppCompatActivity {
    String username;
    Intent user_data;
    TextView message, lucky_number;
    String msg_template = ", Here is your today's lucky number";
    Random random = new Random();
    Integer rdnum = random.nextInt(100);
    Button share, try_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        user_data = getIntent();
        username = user_data.getStringExtra("username");
        message = findViewById(R.id.lucky_msg);
        lucky_number = findViewById(R.id.lucky_number);
        message.setText(username+msg_template);
        lucky_number.setText(rdnum.toString());
        share = findViewById(R.id.share_btn);
        try_again = findViewById(R.id.try_again_btn);


        try_again.setOnClickListener(view->{
            rdnum = random.nextInt(100);
            lucky_number.setText(rdnum.toString());
        });

    }


}