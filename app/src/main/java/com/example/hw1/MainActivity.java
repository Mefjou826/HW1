package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameEdText;
    private EditText locationEdText;
    private EditText timeEdText;
    private EditText time2EdText;
    private EditText priceEdText;

    private  String name, location, time, time2, price;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdText = findViewById(R.id.name);
        locationEdText = findViewById(R.id.location);
        timeEdText = findViewById(R.id.time);
        time2EdText = findViewById(R.id.time2);
        priceEdText = findViewById(R.id.price);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = nameEdText.getText().toString();
                location = locationEdText.getText().toString();
                time = timeEdText.getText().toString();
                time2 = time2EdText.getText().toString();
                price = priceEdText.getText().toString();

                User user = new User(name, location, time, time2, price);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("user", user);
                startActivity(intent);
            }
        });
    }
}