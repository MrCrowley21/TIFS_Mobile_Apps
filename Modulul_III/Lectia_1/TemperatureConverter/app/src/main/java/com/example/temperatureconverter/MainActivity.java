package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText textInput;
    private RadioButton celsiusButton;
    private RadioButton fahrenheitButton;
    private Button calculateButton;
    private TextView textOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInput = (EditText) findViewById(R.id.TextInput);
        celsiusButton = (RadioButton)
                findViewById(R.id.CelciusButton);
        fahrenheitButton = (RadioButton)
                findViewById(R.id.FahrenheitButton);
        calculateButton = (Button)
                findViewById(R.id.CalculateButton);
        textOutput = (TextView) findViewById(R.id.TextOutput);
        View.OnClickListener listener = new ButtonListener();
        calculateButton.setOnClickListener(listener);
    }
        private class ButtonListener implements View.OnClickListener {
            @Override
            public void onClick(View v) {
                buttonClickHandler();
            }
        }
        private void buttonClickHandler() {
            String text = textInput.getText().toString();
            if(text.length() == 0) {
                showToast("Please enter a a valid number");
                return;
            }
            float value = Float.parseFloat(text);
            String result = "";
            if(celsiusButton.isChecked()) {
                float c = convertFahrenheitToCelsius(value);
                result = "" + c + " Celsius";
            }
            else if(fahrenheitButton.isChecked()) {
                float f = convertCelsiusToFahrenheit(value);
                result = "" + f + " Fahrenheit";
            }
            else {
                showToast("Please select a radio button");
                return;
            }
            textOutput.setText(result);
        }
        private float convertFahrenheitToCelsius(float fahrenheit) {
            return ((fahrenheit - 32) * 5 / 9);
        }
        private float convertCelsiusToFahrenheit(float celsius) {
            return ((celsius * 9) / 5) + 32;
        }
        private void showToast(String msg) {
            Toast toast = Toast.makeText(this, msg,
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }