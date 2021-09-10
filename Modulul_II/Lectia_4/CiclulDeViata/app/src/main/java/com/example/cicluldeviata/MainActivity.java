package com.example.cicluldeviata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Ciclul de viață","este apelat onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclul de viață","este apelat onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclul de viață","este apelat onResume");
    }
    @Override
    protected void onPause() {
        Log.d("Ciclul de viață","este apelat onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclul de viață","este apelat onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclul de viață","este apelat onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ciclul de viață","este apelat onDestroy");
    }
}