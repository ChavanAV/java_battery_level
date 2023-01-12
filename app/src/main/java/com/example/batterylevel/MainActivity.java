package com.example.batterylevel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button b;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.txtvw);
        b = findViewById(R.id.btn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               BatteryManager bm = (BatteryManager) getSystemService(BATTERY_SERVICE);
               int per = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
               tv.setText("Battery Level :- "+per+"%");
            }
        });


    }
}