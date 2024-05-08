package com.example.prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Vehicle vehicle;
    private TextView textViewMileage, textViewFuel;
    private EditText editTextFuelAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vehicle = new Sedan(); // Choose the type dynamically as needed

        textViewMileage = findViewById(R.id.textViewMileage);
        textViewFuel = findViewById(R.id.textViewFuel);
        editTextFuelAmount = findViewById(R.id.editTextFuelAmount);
        Button btnDrive = findViewById(R.id.btnDrive);
        Button btnAddFuel = findViewById(R.id.btnAddFuel);

        btnDrive.setOnClickListener(v -> {
            vehicle.drive();
            updateUI();
        });

        btnAddFuel.setOnClickListener(v -> {
            double fuel = Double.parseDouble(editTextFuelAmount.getText().toString());
            vehicle.addFuel(fuel);
            updateUI();
        });

        updateUI();
    }

    private void updateUI() {
        textViewMileage.setText("Mileage: " + vehicle.getMileage());
        textViewFuel.setText("Fuel: " + vehicle.getFuel());
    }
}