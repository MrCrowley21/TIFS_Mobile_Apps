package com.example.edittextexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    EditText nume, prenume, datanasterii, email, telefon;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nume=(EditText)findViewById(R.id.txtNume);
        prenume = (EditText)findViewById(R.id.txtPren);
        datanasterii = (EditText)findViewById(R.id.txtDate);
        email = (EditText)findViewById(R.id.txtEmail);
        telefon= (EditText)findViewById(R.id.txtTel);
        btnSubmit = (Button)findViewById(R.id.btnSend);
        result = (TextView)findViewById(R.id.resultView);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nume.getText().toString().isEmpty() ||
                        prenume.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||
                        datanasterii.getText().toString().isEmpty()
                        || telefon.getText().toString().isEmpty()) {
                    result.setText("Completați toate câmpurile!");
                } else {
                    result.setText("Nume - " +
                            nume.getText().toString() + " \n" + "Prenume - " +
                            prenume.getText().toString()
                            + " \n" + "E-Mail - " +
                            email.getText().toString() + " \n" + "Data nașterii - " +
                            datanasterii.getText().toString()
                            + " \n" + "Telefon - " +
                            telefon.getText().toString());
                }
            }
        });
    }
}