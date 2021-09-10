package com.example.analog_digital_clock;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DigitalClock simpleDigitalClock = (DigitalClock) findViewById
                (R.id.digitalClock);
        AnalogClock simpleAnalogClock = (AnalogClock) findViewById(R.
                id.analogClock);
        simpleAnalogClock.setOnClickListener(new View.OnClickListener
                () {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ceas analog", Toast.LENGTH_LONG).show();
            }
        });
        simpleDigitalClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ceas digital", Toast.LENGTH_LONG).
                        show();
            }
        });
    }
}