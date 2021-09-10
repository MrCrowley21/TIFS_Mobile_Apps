package com.example.backstack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PrimulFragment fragmentPrimul = new PrimulFragment();
        fragmentTransaction.add(R.id.fereastra , fragmentPrimul);
        fragmentTransaction.addToBackStack("primulFragment");
        fragmentTransaction.commit();
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DoileaFragment fragmentDoilea = new DoileaFragment();
                fragmentTransaction.replace(R.id.fereastra , fragmentDoilea);
                fragmentTransaction.addToBackStack("doileaFragment");
                fragmentTransaction.commit();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                PrimulFragment fragmentPrimul = new PrimulFragment();
                fragmentTransaction.replace(R.id.fereastra , fragmentPrimul);
                fragmentTransaction.addToBackStack("primulFragment");
                fragmentTransaction.commit();
            }
        });
    }
}
