package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextBrand = findViewById(R.id.brand);
        final EditText editTextKm = findViewById(R.id.kilometers);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String strBrand = editTextBrand.getText().toString();
                final String strKm = editTextKm.getText().toString();

                Vehicle vehicle = new Vehicle(strBrand, strKm);

                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                startActivity(intent);
                intent.putExtra("EXTRA_VEHICLE", vehicle);
                startActivity(intent);
            }
        });

    }


}
