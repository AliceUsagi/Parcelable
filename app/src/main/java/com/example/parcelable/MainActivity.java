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

        final EditText editText = findViewById(R.id.brand);
        final EditText editText1 = findViewById(R.id.kilometers);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vehicle vehicle = new Vehicle("Honda", "120000");

                String brand = editText.getText().toString();
                String kilometers = editText1.getText().toString();

                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                startActivity(intent);
                intent.putExtra("EXTRA_BRAND", brand);
                intent.putExtra("EXTRA_KILOMETERS", kilometers);
                startActivity(intent);
            }
        });

    }


}
