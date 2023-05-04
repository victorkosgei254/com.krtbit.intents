package com.kritbit.lucky_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    Button get_lucky;
    Intent user_bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.name);
        get_lucky = findViewById(R.id.get_lucky_number);

        get_lucky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString() == "")
                {
                    Toast.makeText(MainActivity.this, "To whom does this lucky number belong to...Please enter a name",Toast.LENGTH_LONG).show();
                }else{
                    user_bundle = new Intent(getApplicationContext(),LuckyNumber.class);
                    user_bundle.putExtra("username", username.getText().toString());
                    startActivity(user_bundle);
                }
            }
        });
    }
}