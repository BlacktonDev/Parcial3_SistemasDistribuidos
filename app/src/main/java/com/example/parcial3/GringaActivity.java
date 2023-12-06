package com.example.parcial3;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GringaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gringa);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(v -> {

            onBackPressed();
        });
    }
}
