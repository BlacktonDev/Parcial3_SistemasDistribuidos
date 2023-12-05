package com.example.parcial3;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class restaurantesActivity extends AppCompatActivity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_restaurantes);

    Button DonCheloBtn = findViewById(R.id.DonCheloBtn);
    Button GringaBtn = findViewById(R.id.GringaBtn);
    Button AlitasBtn = findViewById(R.id.AlitasBtn);

    DonCheloBtn.setOnClickListener(v -> {
        // Al presionar el botón Don Chelo, iniciar DonCheloActivity
        startActivity(new Intent(restaurantesActivity.this, DonCheloActivity.class));
    });

    GringaBtn.setOnClickListener(v -> {
        // Al presionar el botón Gringa, iniciar GringaActivity
        startActivity(new Intent(restaurantesActivity.this, GringaActivity.class));
    });

    AlitasBtn.setOnClickListener(v -> {
        // Al presionar el botón Alitas, iniciar AlitasActivity
        startActivity(new Intent(restaurantesActivity.this, AlitasActivity.class));
    });


}

}
