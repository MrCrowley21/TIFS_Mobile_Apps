package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    CheckBox muzica, desenul, jocul, bucataria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        muzica = (CheckBox)findViewById(R.id.chkmuzica);
        desenul = (CheckBox)findViewById(R.id.chkdesenul);
        jocul = (CheckBox)findViewById(R.id.chkJocul);
        bucataria = (CheckBox)findViewById(R.id.chkbucataria);
        Button btn = (Button)findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selectat";
                if(muzica.isChecked()){
                    result += "\nMuzica";
                }
                if(jocul.isChecked()){
                    result += "\nDesenul";
                }
                if(desenul.isChecked()){
                    result += "\nJocul";
                }
                if(bucataria.isChecked()){
                    result += "\nBucataria";
                }
                Toast.makeText(getApplicationContext(), result,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        switch(view.getId()) {
            case R.id.chkmuzica:
                str = checked?"Selectat Muzica":"Muzica deselectat";
                break;
            case R.id.chkdesenul:
                str = checked?"Selectat Desenul":"Desenul deselectat";
                break;
            case R.id.chkJocul:
                str = checked?"Selectat Jocul":"Jocul deselectat";
                break;
            case R.id.chkbucataria:
                str = checked?"Selectat Bucataria":"Bucataria deselectata";
                break;
        }
        Toast.makeText(getApplicationContext(), str,
                Toast.LENGTH_LONG).show();
    }
}