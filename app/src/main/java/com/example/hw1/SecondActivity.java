package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            User user = (User) bundle.getSerializable("user");
            textView.setText( "Имя: " + user.getName() + "\n" +
                    "Место прибытия: " + user.getLocation() + "\n" +
                    "Время отправления: " + user.getTime() + "\n" +
                    "Время прибытия: " + user.getTime2() + "\n" +
                    "Стоимость: " + user.getPrice());
        } else if (bundle == null) {
            textView.setText("Заполните данные!");
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}