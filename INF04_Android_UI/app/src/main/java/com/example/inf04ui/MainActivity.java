package com.example.inf04ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.b1).setOnClickListener(v -> open(Task1Activity.class));
        findViewById(R.id.b2).setOnClickListener(v -> open(Task2Activity.class));
        findViewById(R.id.b3).setOnClickListener(v -> open(Task3Activity.class));
        findViewById(R.id.b4).setOnClickListener(v -> open(Task4Activity.class));
        findViewById(R.id.b5).setOnClickListener(v -> open(Task5Activity.class));
        findViewById(R.id.b6).setOnClickListener(v -> open(Task6Activity.class));
        findViewById(R.id.b7).setOnClickListener(v -> open(Task7Activity.class));
    }

    private void open(Class<?> activityClass) {
        startActivity(new Intent(this, activityClass));
    }
}
