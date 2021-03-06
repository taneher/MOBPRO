package com.example.alex.servicesreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startDemoService;
    Button stopDemoService;
    Button intentService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startDemoService = (Button) findViewById(R.id.startServiceButton);
        stopDemoService = (Button) findViewById(R.id.stopServiceButton);
        intentService = (Button) findViewById(R.id.intentServiceButton);

        startDemoService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent demoService = new Intent(getApplicationContext(), DemoService.class);
                startService(demoService);
            }
        });

        stopDemoService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(getApplicationContext(), DemoService.class));
            }
        });

        intentService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentService = new Intent(getApplicationContext(), DemoIntentService.class);
                startService(intentService);
            }
        });
    }
}
