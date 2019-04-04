package com.example.parcelable;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        Intent intent = getIntent();
        Vehicle vehicle = intent.getParcelableExtra("EXTRA_VEHICLE");

        TextView tvBrand1 = findViewById(R.id.brand);
        TextView tvKilometers1 = findViewById(R.id.kilometers);

        tvBrand1.setText(vehicle.getName());
        tvKilometers1.setText(vehicle.getKilometers());

    }


}
