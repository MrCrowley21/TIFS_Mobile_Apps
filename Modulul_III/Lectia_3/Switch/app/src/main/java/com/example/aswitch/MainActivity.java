package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Switch sw = findViewById(R.id.switch1);
        if (sw != null) {
            sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                      @Override
                                                      public void onCheckedChanged(CompoundButton buttonView, boolean
                                                              isChecked) {
                                                          String msg = isChecked ? "ON" : "OFF";
                                                          Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                                                          sw.setText(msg);
                                                      }
                                                  });
        }
    }
}