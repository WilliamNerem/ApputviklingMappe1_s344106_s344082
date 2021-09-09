package com.example.apputviklingmappe1_s344106_s344082;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_start = (Button)findViewById(R.id.button_start);
        final Button button_statistikk = (Button)findViewById(R.id.button_statistikk);
        final Button button_preferanser = (Button)findViewById(R.id.button_preferanser);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StartSpill.class));
            }

        });

        button_statistikk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SeStatistikk.class));
            }
        });
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StartSpill.class));
            }
        });
    }





}