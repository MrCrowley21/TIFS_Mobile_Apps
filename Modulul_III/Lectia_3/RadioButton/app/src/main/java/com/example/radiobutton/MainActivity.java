package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    RadioButton matematica, informatica, chimia, fizica, biologia;
    String selectedSuperSubject;
    Button trimite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        matematica = (RadioButton) findViewById(R.id.matematica);
        informatica = (RadioButton) findViewById(R.id.informatica);
        chimia = (RadioButton) findViewById(R.id.chimia);
        fizica = (RadioButton) findViewById(R.id.fizica);
        biologia = (RadioButton) findViewById(R.id.biologia);
        trimite = (Button) findViewById(R.id.trimiteButton);
        trimite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (informatica.isChecked()) {
                    selectedSuperSubject =
                            informatica.getText().toString();
                } else if (biologia.isChecked()) {
                    selectedSuperSubject =
                            biologia.getText().toString();
                } else if (matematica.isChecked()) {
                    selectedSuperSubject =
                            matematica.getText().toString();
                } else if (fizica.isChecked()) {
                    selectedSuperSubject =
                            fizica.getText().toString();
                } else if (chimia.isChecked()) {
                    selectedSuperSubject =
                            chimia.getText().toString();
                }
                Toast.makeText(getApplicationContext(),
                        selectedSuperSubject, Toast.LENGTH_LONG).show();
            }
        });
    }
}